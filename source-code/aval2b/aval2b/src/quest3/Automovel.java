package quest3;

public abstract class Automovel {
	protected float capacidadeMotor;
	protected int velocidade;
	
	
	public void setCapacidadeMotor(float capacidadeMotor) {
		this.capacidadeMotor = capacidadeMotor;
	}
	
	public void acelerar(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void parar(int velocidade) {
		this.velocidade -= getVelocidade();
	}

	public float getCapacidadeMotor() {
		return capacidadeMotor;
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	

}
