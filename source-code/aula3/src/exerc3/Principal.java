package exerc3;
import java.time.LocalDate;

import exerc1.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto prodimp = new Produto();
		prodimp.nomeProduto = "Arroz ";
		prodimp.descrProduto = "tipo 1 parbolizado ";
		prodimp.dataFabricacao = LocalDate.of(2024,7,20);
		
		System.out.println(" Produto1: " + prodimp);

	}

}
