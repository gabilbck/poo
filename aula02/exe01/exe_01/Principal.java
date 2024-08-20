package aula_02;

public class Principal {

	public static void main(String[] args) {
		Numero numerox = new Numero();
		int i = numerox.iNumero;
		
		for(i=50; i<=100; i++) {
			numerox.iNumero = i;
			System.out.println("Numero " + numerox);
		}
	}

}
