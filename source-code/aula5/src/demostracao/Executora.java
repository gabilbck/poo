package demostracao;

public class Executora {

	public static void main(String[] args) {
		MontainBike bicMontainBike = new MontainBike(18, 60, "anti shock");
		Ciclismo bicCiclismo = new Ciclismo(24, 700, 25);
		
		System.out.println("Montain Bike " + bicMontainBike.obterDescricao());
		System.out.println("Ciclismo" + bicCiclismo.obterDescricao());

		

	}

}
