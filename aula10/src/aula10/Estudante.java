package aula10;

public class Estudante {
	private int matrEstudante;
	private String nomeEstudante;
	private String cidadeEstudante;
	
	public Estudante(int matrEstudante, String nomeEstudante, String cidadeEstudante) {
		super();
		this.matrEstudante = matrEstudante;
		this.nomeEstudante = nomeEstudante;
		this.cidadeEstudante = cidadeEstudante;
	}

	public int getMatrEstudante() {
		return matrEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public String getCidadeEstudante() {
		return cidadeEstudante;
	}
}
