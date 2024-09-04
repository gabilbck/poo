package garagem;

public class Carro extends Veiculo {
	private int capacidadePass; //passageiros

	public Carro(String corVeiculo, int velocidadeVeiculo, String marcaVeiculo, int capacidadePass) {
		super(corVeiculo, velocidadeVeiculo, marcaVeiculo);
		this.capacidadePass = capacidadePass;
	}

	public int getCapacidadePass() {
		return capacidadePass = 5;
	}
	
	public void carro() {
		if(velocidadeVeiculo == 0) {
			System.out.println("Carro " + marcaVeiculo + " com capacidade de " + capacidadePass + " passageiros enta pronto para dirigir");
		} else {
			System.out.println("Carro " + marcaVeiculo + " com capacidade de " + capacidadePass + " passageiros esta em movimento.");
		}
	}
}