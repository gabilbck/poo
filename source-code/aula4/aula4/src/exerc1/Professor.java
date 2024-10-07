package exerc1;

public abstract class Professor {
	protected int matriculaProfessor;
	protected String nomeProfessor;
	protected String titulacaoProfessor;
	protected double valorHora;
	
	public Professor(int matriculaProfessor, String nomeProfessor, String titulacaoProfessor) { //, double valorHora) {
		this.matriculaProfessor = matriculaProfessor;
		this.nomeProfessor = nomeProfessor;
		this.titulacaoProfessor = titulacaoProfessor;
		//this.valorHora = valorHora;
	}
	
	public double calcSalario() {
		return calcSalario();
	}
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setValorHora(double valorHora) {
		 this.valorHora = valorHora;
	}	 

	public String getTitulacaoProfessor() {
		if(titulacaoProfessor.equals("Especializacao") || titulacaoProfessor.equals("Mestrado") || titulacaoProfessor.equals("Doutorado")) {
			return titulacaoProfessor;
	  }else {
	  	return titulacaoProfessor = "Titulação Inválida";
	   }
	}
	

	public double getValorHora() {
		if(getTitulacaoProfessor().equals("Especializacao")) {
			setValorHora(45.00);
			return valorHora;
		}else if ((getTitulacaoProfessor().equals("Mestrado"))) {
			setValorHora(55.00);
			return valorHora;
		}else if ((getTitulacaoProfessor().equals("Doutorado"))) {
			setValorHora(65.00);
			return valorHora;
		}else {
			return valorHora = 0.0;
		}
			
		
	}
	
	
}
