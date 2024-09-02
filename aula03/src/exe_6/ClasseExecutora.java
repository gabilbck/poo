package exerc6;

public class ClasseExecutora {

	public static void main(String[] args) {
		Salario salarioMS = new Salario("Maximiano de Souza", (float)10, (float)10, (float)0.0);
		System.out.println(salarioMS);
		System.out.println("Salario Total: " + salarioMS.calcularSalarioFuncionario(10f, 10f, 0f));
		
		Salario salarioGS = new Salario("Gabriela de Souza",  10f, 5.00f, 10.0f);
		System.out.println(salarioGS);
		System.out.println("Salario Total: " + salarioGS.calcularSalarioFuncionario(salarioGS.getSalarioHora(),
				salarioGS.getHorasTrabalhadas(),salarioGS.getHorasExtras()));

	}

}
