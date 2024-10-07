package desafio;

public class Veiculo {
	private String placaVeiculo;
	private String marcaVeiculo;
	private String corVeiculo;
	
	public Veiculo(String placaVeiculo, String marcaVeiculo, String corVeiculo) {
		this.placaVeiculo = placaVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.corVeiculo = corVeiculo;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public String getCorVeiculo() {
		return corVeiculo;
	}

	@Override
	public String toString() {
		return "Veiculo [placaVeiculo=" + placaVeiculo + ", marcaVeiculo=" + marcaVeiculo + ", corVeiculo=" + corVeiculo
		    + "]";
	}
	
	

}
