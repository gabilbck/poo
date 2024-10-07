package exerc3;

public class Estudante {
	private int matrEstudante;
	private String nomeEstudante;
	private float notaTrab1;
	private float notaTrab2;
	private float notaPrv1;
	private float notaPrv2;
	
	public int getMatrEstudante() {
		return matrEstudante;
	}
	public void setMatrEstudante(int matrEstudante) {
		this.matrEstudante = matrEstudante;
	}
	public String getNomeEstudante() {
		return nomeEstudante;
	}
	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}
	public float getNotaTrab1() {
		return notaTrab1;
	}
	public void setNotaTrab1(float notaTrab1) {
		this.notaTrab1 = notaTrab1;
	}
	public float getNotaTrab2() {
		return notaTrab2;
	}
	public void setNotaTrab2(float notaTrab2) {
		this.notaTrab2 = notaTrab2;
	}
	public float getNotaPrv1() {
		return notaPrv1;
	}
	public void setNotaPrv1(float notaPrv1) {
		this.notaPrv1 = notaPrv1;
	}
	public float getNotaPrv2() {
		return notaPrv2;
	}
	public void setNotaPrv2(float notaPrv2) {
		this.notaPrv2 = notaPrv2;
	}
	
	public float calcularMedia() {
		return ((getNotaTrab1() + getNotaTrab2()+ getNotaPrv1() + getNotaPrv2())/4);
	}
	
	public String situacaoEstudante() {
		if(calcularMedia() >= 6.0) {
			return "Aprovado!";
		}
		else if ((calcularMedia() < 6.0 && calcularMedia() >= 4.0)) {
			return "Exame!";
		}
		else {
			return "Refazer a Disciplina!";
		}
	}
	@Override
	public String toString() {
		return "Estudante:  matrEstudante= " + matrEstudante + ", nomeEstudante= " + nomeEstudante + ", notaTrab1= " + notaTrab1
		    + ", notaTrab2= " + notaTrab2 + ", notaPrv1= " + notaPrv1 + ", notaPrv2= " + notaPrv2 + ", Media = "
		    + calcularMedia() + " " + situacaoEstudante();
	}
	

}
