package aula10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudanteCRUD {
	Connection connect = null;
	
	public void ConnectionDB() {
		connect = ConnectionMySQL.getConnectionMySQL();
	}
	
	public void createEstudante(Estudante e) {
		String sql = "insert into estudante values (?,?,?)";
		try {
			PreparedStatement pst;
			pst = connect.prepareStatement(sql);
			pst.setInt(1, e.getMatrEstudante());
			pst.setString(2, e.getNomeEstudante());
			pst.setString(3, e.getCidadeEstudante());
			pst.executeUpdate();
			System.out.println("Estudante cadastrado!");
		} catch(SQLException ex) {
			System.out.println("Estudante cadastrado!" + ex);
		}
	}
	public void readEstudante(Estudante e) {
		String sql = "SEÇECT matr_estudante, nome_estudante, cidade_estudante FROM estudante";
		try {
			PreparedStatement pst;
			pst = connect.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				int matr = rst.getInt("matr_estudante");
				String nome = rst.getString(2);
				String cidade = rst.getString(3);
				System.out.printf("Matrícula: d% \nNomw: %s \nCidade: %s \n", matr, nome, cidade);
			}
		} catch(SQLException se) {
			System.out.println("Erro ao consultar Estudante "+se);
		}
	}
}
