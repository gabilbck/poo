package desafio;

public abstract class Quadrilatero {
	protected float largura;
	protected float altura;
	protected double raio;
	String nome;

	public Quadrilatero() {
		//System.out.print("Construtor de Quadrilátero \n");
	}

	
	public abstract float calcularArea();
	public abstract float calcularPerimetro();
	
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

	
}
