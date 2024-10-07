package garagem;

public class Carro extends Veiculo {
	private int capacidadePass;
	
	public Carro() {
		
	}
	
	public void setCapacidadePass(int capacidadePass) {
		if(capacidadePass > 5) 
			System.out.println("Veiculo não suporta a capacidade "+ capacidadePass);
		else 
			this.capacidadePass = capacidadePass;
  }


	public int verficarCapacidade() {
		return capacidadePass;	
	}
	
	
}
