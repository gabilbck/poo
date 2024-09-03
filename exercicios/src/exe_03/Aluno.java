package exe_03;

public class Aluno {
	private int matriculaAluno;
	private String nomeAluno;
	private float nota1Aluno;
	private float nota2Aluno;
	private float nota3Aluno;
	private float nota4Aluno;
	
	public Aluno(int matriculaAluno, String nomeAluno, float nota1Aluno, float nota2Aluno, float nota3Aluno, float nota4Aluno) {
		this.matriculaAluno = matriculaAluno;
		this.nomeAluno = nomeAluno;
		this.nota1Aluno = nota1Aluno;
		this.nota2Aluno = nota2Aluno;
		this.nota3Aluno = nota3Aluno;
		this.nota4Aluno = nota4Aluno;
	}
	
	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public float getNota1Aluno() {
		return nota1Aluno;
	}

	public float getNota2Aluno() {
		return nota2Aluno;
	}

	public float getNota3Aluno() {
		return nota3Aluno;
	}

	public float getNota4Aluno() {
		return nota4Aluno;
	}

	public String retornaMedia(float nota1Aluno, float nota2Aluno, float nota3Aluno, float nota4Aluno) {
		float media = (nota1Aluno + nota2Aluno + nota3Aluno + nota4Aluno)/4;
		if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Exame";
        } else {
            return "Reprovado";
        }
	}

	@Override
	public String toString() {
		return "Aluno [matriculaAluno=" + matriculaAluno + ", nomeAluno=" + nomeAluno + ", nota1Aluno=" + nota1Aluno
				+ ", nota2Aluno=" + nota2Aluno + ", nota3Aluno=" + nota3Aluno + ", nota4Aluno=" + nota4Aluno + "]";
	}
}
