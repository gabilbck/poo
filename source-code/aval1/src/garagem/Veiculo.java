package garagem;

public abstract class Veiculo {
	protected String corVeiculo;
	protected int velocidadeVeiculo;
	protected String marcaVeiculo;
	
		
	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	public void setVelocidadeVeiculo(int velocidadeVeiculo) {
		this.velocidadeVeiculo = velocidadeVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public float acelerar(int velocidadeVeiculo) {
		return this.velocidadeVeiculo += velocidadeVeiculo;
	}
	public void frear(int velocidadeVeiculo) {
		this.velocidadeVeiculo -= velocidadeVeiculo;
	}
	
	public char obterMarca() {
		return this.marcaVeiculo.charAt(0); // somente para atender a especificação
	}

	public String getCorVeiculo() {
		return corVeiculo;
	}

	public int getVelocidadeVeiculo() {
		return velocidadeVeiculo;
	}
	
}
