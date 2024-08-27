package exe_02;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Produto prod1 = new Produto("Arroz", "Soltinho", LocalDate.of(2024, 8, 26));
		/*nao funciona com private: 
		Produto prod1 = new Produto();
		 prod1.nomeProduto = ("Arroz");
		*/
		System.out.println(prod1);
		
		System.out.println(prod1.getDataFabricacao());
		
		
	}

}
