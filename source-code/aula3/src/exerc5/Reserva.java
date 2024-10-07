package exerc5;

public class Reserva {
	private String nomePessoa;
	private String tipoPessoa;
	private int qtdeDias;
	
	public Reserva() {
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public int getQtdeDias() {
		return qtdeDias;
	}
	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}

	public void validarEmprestimo(String tpPessoa) {
		if (getTipoPessoa().equals("Estudante")) {
			setQtdeDias(5);
		}
		else if (getTipoPessoa().equals("Professor")) {
			setQtdeDias(3);
		}
		else if (getTipoPessoa().equals("Comunidade")) {
			setQtdeDias(4);
		}
		else {
			System.out.println("Não há opção de empréstimo");
		}
	
	}
	
	
	@Override
	public String toString() {
		return "Reserva [nomePessoa=" + nomePessoa + ", tipoPessoa=" + tipoPessoa + ", qtdeDias=" + qtdeDias + "]";
	}

}
