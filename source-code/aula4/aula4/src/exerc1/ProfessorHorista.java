package exerc1;

public class ProfessorHorista extends Professor {
	private int cargaHoraria;

	public ProfessorHorista(int matriculaProfessor, String nomeProfessor, String titulacaoProfessor, int cargaHoraria) {
		super(matriculaProfessor, nomeProfessor, titulacaoProfessor);
		this.cargaHoraria = cargaHoraria;
	}
		
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public double calcSalario() {
		return getCargaHoraria() * getValorHora();
	}

}
