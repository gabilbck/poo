package aula10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
	public static String status = "Não conectado";
	
	public ConnectionMySQL() {
		
	}
	
	public static java.sql.Connection getConnectionMySQL(){
		Connection connection = null;
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverName);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String serverName = "localhost";
		String mydatabase = "escoladb";
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
		String username = "root";
		String password = "";
		
		try {
			// connection = DriverManager.getConnection(url, username, password);
			connection = DriverManager.getConnection("jdbc:mysql://localhost/escoladb","root","");
			status = "Bd " + mydatabase + " conectado";
			System.out.println(status);
		} catch(SQLException e){
			System.out.println(status);
			e.printStackTrace();
		}
		return connection;
	}
}
