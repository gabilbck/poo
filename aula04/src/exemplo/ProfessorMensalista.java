package exemplo;

public class ProfessorMensalista extends Professor {
	protected float valorSalario;
	
	public ProfessorMensalista(int matriculaProfessor, String nomeProfessor, float valorSalario) {
		super(matriculaProfessor, nomeProfessor);
		this.valorSalario = valorSalario;
	}
	
	public float getValorSalario() {
		return valorSalario;
	}

	@Override
	public String toString() {
		return "ProfessorMensalista [valorSalario=" + valorSalario + ", matriculaProfessor=" + matriculaProfessor
				+ ", nomeProfessor=" + nomeProfessor + "]";
	}

	
}
