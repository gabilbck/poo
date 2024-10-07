package exerc1;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Produto prod1 = new Produto();

		prod1.nomeProduto = "Arroz ";
		prod1.descrProduto = "tipo 1 parbolizado ";
		prod1.dataFabricacao = LocalDate.of(2024,7,20);
		
		System.out.println(" Produto1: " + prod1);
				
		Produto prod2 = new Produto();
		prod2.nomeProduto = "Feijão ";
		prod2.descrProduto = "tipo 1 preto ";
		prod2.dataFabricacao = LocalDate.now();
		
		System.out.println(" Produto2: " + prod2);

	}

}
