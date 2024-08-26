package aula2;

public class Main {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		
		estudante1.nomeEstudante = "Asdrubal o Bom em OO";
		estudante1.nomeCursoMatriculado = "Engenharia de Software";
		estudante1.idadeEstudante = 20;
		System.out.println("Estudante 1" + estudante1);
		
		estudante2.nomeEstudante = "Mariazinha Excelente em OO";
		estudante2.nomeCursoMatriculado = "Engenharia de Software";
		estudante2.idadeEstudante = 21;
		
		System.out.println("nome :" + estudante2.nomeEstudante + " Curso :" + estudante2.nomeCursoMatriculado
				+ " idade: " + estudante2.idadeEstudante);
	}


}
