package polimorfismo;

public class Ciclismo extends Bicicleta {
	private int espessuraPneu;

	public Ciclismo(int marcha, int cadencia, int espessuraPneu) {
		super(marcha, cadencia);
		this.espessuraPneu = espessuraPneu;
	}

	public String obterDescricao() {
		return super.obterDescricao() + " Espessura Pneu " + this.espessuraPneu;
	}
}
