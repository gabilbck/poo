package exerc2;

public class ValordeX {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Iniciando...em " + x +"\n");
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.println("o valor de x é:" + x);
		}

	}

}
