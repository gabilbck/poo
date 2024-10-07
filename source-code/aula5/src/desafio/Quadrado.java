package desafio;

public class Quadrado extends Retangulo {
	
	public Quadrado() {
		setNome("Quadrado");
		super.setLargura(super.getAltura());
	}
	
	public double calculaArea() {
		return (getLargura() * getLargura());
	}
	
	public float calcularPerimetro() {
		return (4 * getLargura());
	}


}
