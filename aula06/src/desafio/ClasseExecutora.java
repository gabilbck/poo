package desafio;

import java.util.Random;
import java.util.Scanner;

public class ClasseExecutora {

	public static void main(String[] args) {
		Quadrilatero quadri[] = new Quadrilatero[5];
		Random rdm = new Random();
		
		for (int i=0; i<5; i++, rdm = new Random()) {
			int codigo = rdm.nextInt();
			Scanner entrDados = new Scanner(System.in);
			
			System.out.printf("\n codigo é: %d \n", codigo);
			
			System.out.println("Informe a altura do quadrilatero: ");
			float alturaQuad = entrDados.nextFloat();
			System.out.println("Informe a largura do quadrilatero: ");
			float larguraQuad = entrDados.nextFloat();
			System.out.println("Informe o raio do circulo: ");
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
			if((codigo % 3 == 2) || (codigo % 3 == -2)) {
				quadri[i] = new Circulo();
				quadri[i].raio = raioCirc;
			}
		}
		for (int i=0; i<5; i++) {
			System.out.printf("\n Area do %s e: %f", quadri[i].getNome(), quadri[i].calcularArea());
			System.out.printf("\n Perimentro do %s e: %f", quadri[i].getNome(), quadri[i].calcularPerimetro());
		}
	}
}