package exemplo;

public abstract class Professor {
	protected int matriculaProfessor;
	protected String nomeProfessor;
	
	public Professor(int matriculaProfessor, String nomeProfessor) {
		super();
		this.matriculaProfessor = matriculaProfessor;
		this.nomeProfessor = nomeProfessor;
	}

	public int retornaMatricula() {
		return matriculaProfessor;
	}
	
	public String retornaNomeProfessor() {
		return nomeProfessor;
	}
	
	
}
