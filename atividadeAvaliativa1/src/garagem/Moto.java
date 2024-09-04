package garagem;

public class Moto extends Veiculo {

	public Moto(String corVeiculo, int velocidadeVeiculo, String marcaVeiculo) {
		super(corVeiculo, velocidadeVeiculo, marcaVeiculo);
	}

	public void moto() {
		if(velocidadeVeiculo == 0) {
			System.out.println("Moto " + marcaVeiculo + " com capacidade de 2 passageiros enta pronta para andar");
		} else {
			System.out.println("Moto " + marcaVeiculo + " com capacidade de 2 passageiros esta em movimento.");
		}
	}
}
