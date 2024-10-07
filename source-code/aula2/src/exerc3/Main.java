package exerc3;

public class Main {

	public static void main(String[] args) {
		BalancoTrimestral bltrim = new BalancoTrimestral();
		bltrim.vlrJaneiro = (float) 13500.00;
		bltrim.vlrFevereiro = (float) 23400.00;
		bltrim.vlrMarco = (float) 19000.00;
		
		bltrim.gastoTotal(bltrim.vlrJaneiro, bltrim.vlrFevereiro, bltrim.vlrMarco);
		
		System.out.println(bltrim.mediaGasto(bltrim.vlrJaneiro, bltrim.vlrFevereiro, bltrim.vlrMarco));

	}
}
