package exe2;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Erro: Divisão por zero.");
        }
        return (double) a / b;
    }

}
