package exerc3;
import java.util.Scanner;

public class ClasseExecutora {

	public static void main(String[] args) {
		Estudante est1 = new Estudante();
		Scanner entrDado = new Scanner(System.in);
		
		System.out.print("Informe a Matricula do Estudante: ");
		est1.setMatrEstudante(entrDado.nextInt());
		System.out.print("Informe o Nome do Estudante: ");
		est1.setNomeEstudante(entrDado.next());
		System.out.print("Informe a Nota do Trabalho 1: ");
		est1.setNotaTrab1((float)entrDado.nextFloat());
		System.out.print("Informe a Nota do Trabalho 2: ");
		est1.setNotaTrab2(entrDado.nextFloat());
		System.out.print("Informe a Nota da Prova 1: ");
		est1.setNotaPrv1(entrDado.nextFloat());
		System.out.print("Informe a Nota da Prova 2: ");
		est1.setNotaPrv2(entrDado.nextFloat());
		
		System.out.println(est1);
		entrDado.close();	

	}
	

}
