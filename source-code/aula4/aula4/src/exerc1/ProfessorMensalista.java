package exerc1;

public class ProfessorMensalista extends Professor {
	private static int cargaHoraria = 40;

	public ProfessorMensalista(int matriculaProfessor, String nomeProfessor, String titulacaoProfessor) {
		super(matriculaProfessor, nomeProfessor, titulacaoProfessor);
		
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public double calcSalario() {
		return getCargaHoraria() * getValorHora();
	}
	

}
