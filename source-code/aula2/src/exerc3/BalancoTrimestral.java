package exerc3;

public class BalancoTrimestral {
	float vlrJaneiro;
	float vlrFevereiro;
	float vlrMarco;
	
	public BalancoTrimestral() {
		
	}
	public void gastoTotal(float jan, float fev, float mar) {
		System.out.println("O gasto total é: " + (jan + fev + mar));
	}
	
	public float mediaGasto(float jan, float fev, float mar) {
		return (jan + fev + mar)/3;
	}
}
