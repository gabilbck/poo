package polimorfismo;

public abstract class Bicicleta {
	private int marcha;
	private int cadencia;

	public Bicicleta(int marcha, int cadencia) {
		this.marcha = marcha;
		this.cadencia = cadencia;
	}

	public String obterDescricao() {
		return ("Marcha: " + this.marcha + " cadencia: " + this.cadencia);
	}
}
