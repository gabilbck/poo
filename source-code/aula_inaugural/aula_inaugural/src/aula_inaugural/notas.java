package aula_inaugural;

public class notas {
	public static void main(String[] args) {
		String nomeAluno;
		float nota1;
		float nota2;
		float nota3;
		float media;
		
		nomeAluno = "Asdrubal, o cara";
		nota1 = (float) 8.5;
		nota2 = (float) 6.5;
		nota3 = (float) 4.5;
		
		media = (nota1 + nota2 + nota3)/3;
		if (media >= 6) {
			System.out.println(nomeAluno + " Aprovado");
		}
		else if ((media < 6) && (media >= 4)) {
			System.out.println(nomeAluno + " Verificação Suplementar");
	  }
		else {
			System.out.println(nomeAluno + " Reprovado");
		}
		
	}
}

