package aulaInaugural2;

public class Aluno {
	private String nomeAluno;
	
	public Aluno() {
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	@Override
  public String toString() {
      return nomeAluno;
  }

}
