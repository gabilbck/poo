package desafio;

public class Quadrado extends Retangulo {

	public Quadrado() {
		setNome("Quadrado");
		super.setLargura(super.getAltura());
	}
	
	public float calcularArea() {
		return (getLargura() * getAltura());
	}

	public float calcularPerimetro() {
		return (4 * getLargura());  
	}
}
