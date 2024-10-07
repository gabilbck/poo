package aulaInaugural2;

public class Notas {
	private float nota1;
	private float nota2;
	private float nota3;
	Aluno alunos;
	
	public Notas(float nota1, float nota2, float nota3, Aluno alunos) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.alunos = alunos;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
	
	public float calcMedia(float media) {
		return media = (nota1 + nota2 + nota3)/3;
	}


}
