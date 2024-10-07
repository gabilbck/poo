package desafio;
import java.util.List;
import java.util.ArrayList;

public class Executora {

	public static void main(String[] args) {
		Veiculo veic1 = new Veiculo("AZX456", "Toyota", "Azul");
		Veiculo veic2 = new Veiculo("AYX356", "Ford", "Branco");
		
		 List<Veiculo> veicList = new ArrayList<Veiculo>();
		 veicList.add(veic1);
		 veicList.add(veic2);

		
		Condutor cond1 = new Condutor("James Gosling", 12345678l, 5545334565l,veicList);
		// for(Veiculo i : veicList) {
		  //  System.out.println(i);
	//	}

    
		System.out.println(cond1);
	
	}

}
