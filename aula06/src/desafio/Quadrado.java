package desafio;

public class Quadrado extends Quadrilatero {

	public Quadrado() {
		setNome("Quadrado");
		super.setLargura(super.getAltura());
	}
	
	public float calcularArea() {
		return (getLargura * getAltura);
	}

	@Override
	public float calcularPerimetro() {
		return 0;
	}

}
