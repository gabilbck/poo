package garagem;

public class Caminhao extends Veiculo {
	private float capacidadeCarga;
	
	public Caminhao(String corVeiculo, int velocidadeVeiculo, String marcaVeiculo, float capacidadeCarga) {
		super(corVeiculo, velocidadeVeiculo, marcaVeiculo);
		this.capacidadeCarga = 10.0f; //toneladas
	}

	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void caminhao() {
		if(velocidadeVeiculo == 0) {
			System.out.println("Caminhao " + marcaVeiculo + " com capacidade de carga de " + capacidadeCarga + " t enta pronto para transportar");
		} else {
			System.out.println("Caminhao " + marcaVeiculo + " com capacidade de carga de " + capacidadeCarga + "t esta em movimento.");
		}
	}
}
