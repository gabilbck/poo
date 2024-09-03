package exe_03;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(123, "Gabrieli", 0f, 0f, 0f, 0f);
		System.out.println("Matrícula: " + aluno.getMatriculaAluno() + "\nNome: " + aluno.getNomeAluno());
		System.out.println("Situacao: " + aluno.retornaMedia(1.8f, 6.5f, 7.55f, 1f));
	}
}