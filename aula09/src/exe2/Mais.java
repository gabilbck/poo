package exe2;

public class Mais {

	public Mais() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        try {
            System.out.println("Soma: " + calc.somar(10, 5));
            System.out.println("Subtração: " + calc.subtrair(10, 5));
            System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
            System.out.println("Divisão: " + calc.dividir(10, 0)); // Vai gerar exceção
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }

	}

}
