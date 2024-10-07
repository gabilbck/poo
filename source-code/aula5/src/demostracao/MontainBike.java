package demostracao;

public class MontainBike extends Bicicleta {
	private String suspensao;

	public MontainBike(int marcha, int cadencia, String suspensao) {
		super(marcha, cadencia);
		this.suspensao = suspensao;
		
	}
	public String obterDescricao() {
		return super.obterDescricao() + " Suspensao: " + this.suspensao;
	
	}
	
	

}
