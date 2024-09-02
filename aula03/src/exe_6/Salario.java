package exerc6;

public class Salario {
	private String nomeFuncionário;
	private float horasTrabalhadas = (float) 0.0;
	private float salarioHora;
	private float horasExtras = (float) 0.0;
	
	public Salario(String nomeFuncionário, float horasTrabalhadas, float salarioHora, float horasExtras) {
		this.nomeFuncionário = nomeFuncionário;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
		this.horasExtras = horasExtras;
	}

	public String getNomeFuncionário() {
		return nomeFuncionário;
	}

	public void setNomeFuncionário(String nomeFuncionário) {
		this.nomeFuncionário = nomeFuncionário;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public float getSalarioHora() {
		return salarioHora;
	}

	public float getHorasExtras() {
		return horasExtras;
	}

	public float calcularSalarioFuncionario(float salHora, float horaTrab, float horaExt ) {
		float horaExtra = (float)0.0;
		if (getHorasExtras() > 0) {
			horaExtra = getHorasExtras() * ((getSalarioHora() * (float) 1.50)); 
			return ((salHora * horaTrab) + horaExtra);
		}
		else {
		return (salHora * horaTrab);
		}
		 
		
	}

	@Override
	public String toString() {
		return "Salario do Funcionário= " + nomeFuncionário + ", horasTrabalhadas =" + horasTrabalhadas + ", salarioHora = "
		    + salarioHora;
	}
}
