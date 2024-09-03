package exemplo;

public class ProfessorHorista extends Professor {
	private float valorHoras;
	private int totalHoras;
	
	public ProfessorHorista(int matriculaProfessor, String nomeProfessor, float valorHoras, int totalHoras) {
		super(matriculaProfessor, nomeProfessor);
		this.totalHoras = totalHoras;
		if(valorHoras > 0) this.valorHoras = valorHoras;
	}
	
	public float obterSalario() {
		return valorHoras * totalHoras;
	}

	@Override
	public String toString() {
		return "ProfessorHorista [valorHoras=" + valorHoras + ", totalHoras=" + totalHoras + ", matriculaProfessor="
				+ matriculaProfessor + ", nomeProfessor=" + nomeProfessor + "]";
	}

	

	
}
