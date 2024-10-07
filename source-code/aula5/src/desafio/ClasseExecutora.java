package desafio;
import java.util.Random;
import java.util.Scanner;

public class ClasseExecutora {
	
	public static void main(String[] args) {
		Quadrilatero quadri[] = new Quadrilatero[5];
		Random rdm = new Random();
		
		for (int i = 0; i < 5; i++, rdm = new Random()) {
			int codigo = rdm.nextInt();
			Scanner entrDados = new Scanner(System.in);
					
			System.out.printf("\n Código é: %d \n", codigo);
			
			System.out.println("Informe a Altura do Quadrilatero: ");
			float alturaQuad = entrDados.nextFloat();
			System.out.println("Informe a Largura do Quadrilatero: ");
			float larguraQuad = entrDados.nextFloat();
			System.out.println("Informe o Raio do Círculo: ");
			double raioCirc = entrDados.nextDouble();
								
			if(codigo % 3 == 0) {
				quadri[i] = new Retangulo();
				quadri[i].altura = alturaQuad;
				quadri[i].largura = larguraQuad;
			}
			
			if((codigo % 3 == 1) || (codigo % 3 == -1)) {
				quadri[i] = new Quadrado();
				quadri[i].altura = alturaQuad;
				quadri[i].largura = larguraQuad;
			}			
			if ((codigo % 3 == 2) || (codigo % 3 == -2)) {
				quadri[i] = new Circulo();
				quadri[i].raio = raioCirc;
				
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("\n A área do %s é: %f", quadri[i].getNome(), quadri[i].calcularArea());
			System.out.printf("\n O Perímetro do %s é: %f", quadri[i].getNome(),  quadri[i].calcularPerimetro());
		}
      //quadri[i].getNome(), %s

	}

}
