package garagem;

public class Motocicleta extends Veiculo {

	public Motocicleta() {
		
	}
	
	public void setCapacidadePass(int capacidadePass) {
		if(capacidadePass > 2) 
			System.out.println("Veiculo não suporta a capacidade "+ capacidadePass);
		else 
			System.out.println("Não foi especificado atributo....");
  }

}
