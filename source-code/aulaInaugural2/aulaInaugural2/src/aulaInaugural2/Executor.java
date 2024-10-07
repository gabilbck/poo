package aulaInaugural2;
import java.util.Scanner;

public class Executor {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.printf("Informe o nome do Aluno:\n");
		String nomeAluno = ler.nextLine();
		System.out.printf("Informe a Nota 1 do Aluno:\n");
		float n1 = ler.nextFloat();
		System.out.printf("Informe a Nota 2 do Aluno:\n");
		float n2 = ler.nextFloat();
		System.out.printf("Informe a Nota 3 do Aluno:\n");
		float n3 = ler.nextFloat();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNomeAluno(nomeAluno);
				
		Notas notas1 = new Notas(n1, n2, n3, aluno1);
		notas1.setNota1(n1);
		notas1.setNota2(n2);
		notas1.setNota3(n3);
		notas1.setAlunos(aluno1);
	
		float media = notas1.calcMedia(0);
		if (media >= 6) {
			System.out.println(notas1.getAlunos() + " Aprovado " + media);
		}
		else if ((media < 6) && (media >= 4)) {
			System.out.println(aluno1.getNomeAluno() + " Verificação Suplementar " + media);
	  }
		else {
			System.out.println(nomeAluno + " Reprovado " + media );
		}
			
	}

}
