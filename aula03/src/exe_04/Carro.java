package exe_04;

public class Carro {
	//Atributos
	public int numCarro;
	public char nomePiloto;
	private float velocidadeMaxima;
	private float velocidadeMinima;
	private boolean carroLigado;

	//Construtor
	public Carro(int numCarro, char nomePiloto, float velocidadeMaxima, float velocidadeMinima) {
		this.numCarro = numCarro;
		this.nomePiloto = nomePiloto;
		this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;
        this.carroLigado = false;
	}
	
	//Métodos
	public void acelerar() {
		if(carroLigado) {
			System.out.println("O carro está acelerando");
		} else {
			System.out.println("Erro: O carro está desligado. Ligue o carro primeiro");
		}
	}
	public void parar(){
		if(carroLigado) {
			System.out.println("O carro parou");
		} else {
			System.out.println("Erro: O carro já está desligado.");
		}
	}
	public void frear(float porcentagem) {
		if(carroLigado) {
			System.out.println("O carro está desacelerando " + porcentagem + "% sua velocidade");
		} else {
			System.out.println("Erro: O carro já está desligado.");
		}
	}
	public void desligar() {
		if(carroLigado) {
			carroLigado = false;
			System.out.println("O carro desligou.");
		} else {
			System.out.println("Erro: O carro já está desligado.");
		}
	}
	public void ligar() {
		if(!carroLigado) {
			carroLigado = true;
			System.out.println("O carro ligou.");
		}
	}

}
