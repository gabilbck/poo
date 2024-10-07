package exerc2;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Produto prod1 = new Produto("Arroz", "Aguilhinha tipo Tio João", LocalDate.of(2024,7,20));
	  System.out.println(prod1);
	  
	  System.out.println(prod1.getDataFabricacao());

	}

}
