package garagem;

import java.util.Scanner;

public abstract class Veiculo {
	protected String corVeiculo;
	protected int velocidadeVeiculo;
	protected String marcaVeiculo;

	public Veiculo(String corVeiculo, int velocidadeVeiculo, String marcaVeiculo) {
		super();
		this.corVeiculo = corVeiculo;
		this.velocidadeVeiculo = velocidadeVeiculo;
		this.marcaVeiculo = marcaVeiculo;
	}
	
	public float acelerar() {
		if(velocidadeVeiculo < 200) {
			velocidadeVeiculo += 1;
		}
		return (float) velocidadeVeiculo; //fazer casting pq o valor da velocidade foi definido com int e o método float, baseado no esquema da imagem
	}
	
	public void frear() {
		if(velocidadeVeiculo > 0) {
			velocidadeVeiculo -= 1;
		}
	}
	
	public char obterMarca() {
		Scanner scanner = new Scanner(System.in);
		marcaVeiculo = scanner.next();
		scanner.close();
		return marcaVeiculo.charAt(0); //pega a 1º letra pq é char
	}

	@Override
	public String toString() {
		return "Veiculo [corVeiculo=" + corVeiculo + ", velocidadeVeiculo=" + velocidadeVeiculo + ", marcaVeiculo="
				+ marcaVeiculo + "]";
	}
	
	
}
