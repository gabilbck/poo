package exerc4;

public class Carro {
	public int numCarro;
	public char nomePiloto;
	private float velocidadeMaxima;
	private float velocidadeMinima;
	private boolean carroLigado;

	public void carro() {
	}
	
	
	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}


	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public float getVelocidadeMinima() {
		return velocidadeMinima;
	}

	public void setVelocidadeMinima(float velocidadeMinima) {
		this.velocidadeMinima = velocidadeMinima;
	}

	public boolean isCarroLigado() {
		return carroLigado;
	}


	public void setCarroLigado(boolean carroLigado) {
		this.carroLigado = carroLigado;
	}



	public void acelerar(float veloc) {
		this.velocidadeMaxima = veloc; 

	}
	public void parar(float veloc) {
		this.velocidadeMinima = veloc; 

	}
	public void frear(float velocf) {
		if (velocf == 0.0) {
			System.out.println("O está carro parado");
		}
			else { 
				this.velocidadeMinima = velocf - (velocf * (float)0.30);
			}

	}

	public void desligar() {
		if ((isCarroLigado() && (getVelocidadeMinima() == 0)) ) {
			setCarroLigado(false);
			
		}
		else {
			System.out.println("O carro não está ligado ou em movimento, pare o carro!");
		}
		

	}

	public void ligar() {
		if (isCarroLigado()) {
			System.out.println("O carro está em funcionamento ");
		}
		else {
			setCarroLigado(true);
		}

	}


	@Override
	public String toString() {
		return "Carro [numCarro=" + numCarro + ", nomePiloto=" + nomePiloto + ", velocidadeMaxima=" + velocidadeMaxima
		    + ", velocidadeMinima=" + velocidadeMinima + ", carroLigado=" + carroLigado + "]";
	}


}
