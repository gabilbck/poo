package desafio;

public class Retangulo extends Quadrilatero {
	
	public Retangulo() {
		//System.out.print("Construtor de Retângulo \n");
		setNome("Retangulo");
	}
	
	@Override
	public float calcularArea() {
		return getLargura() * getLargura();
	}

	@Override
	public float calcularPerimetro() {
		return (2 * getLargura()) + (2 * getAltura());
	}

}
