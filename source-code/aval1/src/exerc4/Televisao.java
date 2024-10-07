package exerc4;

public class Televisao {
	private int volume;
	private int canal;
	
	public Televisao(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}
	public void aumentarSom(int volume) {
		this.volume += volume; 
	}
	
	public void diminuirSom(int volume) {
		this.volume -= volume;		
	}
	
	public void aumentarCanal(int canal) {
		this.canal += canal;		
	}

	public void diminuirCanal(int canal) {
		this.canal -= canal;		
	}
	
	public void trocarCanal(int canal) {
		this.canal = canal;		
	}
		
	public int getVolume() {
		return volume;
	}
	public int getCanal() {
		return canal;
	}
	public void verSomCanal() {
		System.out.println("Valor do Volume: " + getVolume() + " Canal Selecionado: " + getCanal());
	}

}
