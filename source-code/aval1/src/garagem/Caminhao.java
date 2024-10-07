package garagem;

public class Caminhao extends Veiculo {
	private float capacidadeCarga;
	
	public Caminhao() {
		
	}
	
	public void setCapacidadeCarga(float capacidadeCarga) {
		if (capacidadeCarga > 75)
			System.out.println("Caminhão nao suporta a carga máxima de :" + capacidadeCarga);
		else 
			this.capacidadeCarga = capacidadeCarga;
	}
	
	public float verificarCapacidadeCarga() {
		return capacidadeCarga;
	}
}
