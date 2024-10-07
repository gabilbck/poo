package exerc4;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ControleRemoto {
		
	public static void main(String[] args) {
		Scanner entrDado = new Scanner(System.in);
		Televisao tv = new Televisao(0, 0);
		char ver = 's';
		
		while (ver == 's') {
			int op = 0;
			System.out.println("---VOLUME----");
			System.out.println("Aumentar Pressione 1");
			System.out.println("Diminuir Pressione 2");
			System.out.println("----CANAL-----");
			System.out.println("Aumentar Pressione 3");
			System.out.println("Diminuir Pressione 4");
			System.out.println("Trocar Canal Pressione 5");
			System.out.println("----GERAL-----");
			System.out.println("Visualizar Som e Canal da TV, Pressione 6");
			System.out.print("Escolha a Opção e Pressione Enter: ");
		  op = entrDado.nextInt();
		  
		  switch (op) {
		  	case 1:
		  		tv.aumentarSom(1);
		  		break;
		  	case 2:
		  		tv.diminuirSom(1);
		  		break;
		  	case 3:
		  		tv.aumentarCanal(1);
		  		break;
		  	case 4:
		  		tv.diminuirCanal(1);
		  		break;
		  	case 5:
		  		System.out.println("Informe o Canal: "); 
		  		tv.trocarCanal(entrDado.nextInt());	
		  		break;
		  	case 6:
		  		tv.verSomCanal();
		  		break;
		  	default:
		  		System.out.println("Opção não disponível no controle remoto!");
		  }
		  
		  System.out.println("Continuar s/n: ");
		  ver = entrDado.next().charAt(0);
		  
		}
		
	}
}
