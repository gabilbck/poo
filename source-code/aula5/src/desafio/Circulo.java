package desafio;

public class Circulo extends Quadrilatero {
	private double PI = Math.PI; //3.14159;
	
	public Circulo() {
		setNome("Círculo");
		
	}

	@Override
	public float calcularArea() {
		return (float) (PI * (getRaio() * getRaio()));
	}

	@Override
	public float calcularPerimetro() {
		return (float)(2 * PI * getRaio());
	}

}
