package demonstracao;

public class ProfessorHorista extends Professor {
	protected float valorHora;
	protected int totalHoras;

	public ProfessorHorista(int matrProfessor, String nmProfessor, float vlrHora, int totalHoras) {
		super(matrProfessor, nmProfessor);
		this.totalHoras = totalHoras; // palavra-chave this para indicar, apontar (ponteiro)para o atributo de instância, 
		                              // do argumento do construtor, ambos possuem o mesmo nome
		if (vlrHora > 0) valorHora = vlrHora; //com condicinal

	}
	
	public float obterSalario() {      //método declarado sem a IDE.
		return valorHora * totalHoras;
		
	}

	@Override
	public String toString() {
		return "ProfessorHorista ---- matriculaProfessor = " + matriculaProfessor + ", nomeProfessor =" + nomeProfessor 
				+ " valorHora = " + valorHora + " totalHoras = " + totalHoras;
	}
	
	

}
