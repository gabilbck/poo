package quest3;

public class Executora {

	public static void main(String[] args) {
		Utilitario util = new Utilitario();
		Passeio passeio = new Passeio();
		
		util.setCapacidadeMotor(2.0f);
		util.setVelocidade(0);
		util.setCapacidadeCarga(1000.00f);
		
		passeio.setVelocidade(0);
		passeio.setCapacidadeMotor(1.4f);
		
		
	}

}
