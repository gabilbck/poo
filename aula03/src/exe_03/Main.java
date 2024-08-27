package exe_03;

import java.time.LocalDate;
import exe_02.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Produto A", "Descrição A", LocalDate.of(2024, 1, 1));

        // Acessando os atributos através dos métodos getters
        System.out.println("Nome do Produto 1: " + produto1.getNomeProduto());
        System.out.println("Data de Fabricação do Produto 1: " + produto1.getDataFabricacao());

        // Alterando os atributos usando os setters
        produto1.setNomeProduto("Novo Produto A");
        produto1.setDataFabricacao(LocalDate.of(2024, 3, 3));
        System.out.println("Novo Nome do Produto 1: " + produto1.getNomeProduto());
        System.out.println("Nova Data de Fabricação do Produto 1: " + produto1.getDataFabricacao());
	}

}
