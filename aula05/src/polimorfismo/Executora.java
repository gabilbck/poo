package polimorfismo;

public class Executora {

	public static void main(String[] args) {
		MontainBike bicMb = new MontainBike(18, 60, "anti-shock");
		Ciclismo bicCicl = new Ciclismo(24, 80, 25);
		
		System.out.println("Montain Bike " + bicMb.obterDescricao());
		System.out.println("Ciclismo " + bicCicl.obterDescricao());
	}
	

	

}
