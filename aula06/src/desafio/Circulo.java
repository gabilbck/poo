package desafio;

public class Circulo extends Quadrilatero {
	private double PI = Math.PI; 

	public Circulo() {
		setNome("Circulo");
	}

	@Override
	public float calcularArea() {
		return (float) (PI * (getRaio() * getRaio()));
	}

	@Override
	public float calcularPerimetro() {
		return (float) (2 * PI * getRaio());
	}

}
