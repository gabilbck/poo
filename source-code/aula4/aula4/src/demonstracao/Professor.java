package demonstracao;

public abstract class Professor {
	protected int matriculaProfessor;
	protected String nomeProfessor;
	
	public Professor (int matrProfessor, String nmProfessor) {
		matriculaProfessor = matrProfessor;
		nomeProfessor = nmProfessor;
	}
	
	public int retornaMatricula() {
		return matriculaProfessor;
	}
	
	public String retornaNomeProfessor() {
		return nomeProfessor;
		
	}
	
}
