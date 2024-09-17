package desafio;

public abstract class Quadrilatero {
	protected float largura;
	protected float altura;
	
	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	protected double raio;
	String nome;
	
	public Quadrilatero() {
		
	}
	
	public abstract float calcularArea();
	public abstract float calcularPerimetro();
	
}