package desafio;

public class Retangulo extends Quadrilatero {

	public Retangulo() {
		setNome("setRetangulo");
	}

	@Override
	public float calcularArea() {
		return getLargura() * getAltura();
	}

	@Override
	public float calcularPerimetro() {
		return (2 * getLargura()) + (2 * getAltura());
	}

}
