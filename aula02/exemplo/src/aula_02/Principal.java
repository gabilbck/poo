package aula_02;

public class Principal {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante(); //Construtor do Estudante
		
		estudante1.nomeEstudante ="Asdrubal o cara de POO";
		estudante1.nomeCursoMatriculado = "Engenharia de Software";
		estudante1.idadeEstudante = 23;
		
		Estudante estudante2 = new Estudante();
		
		estudante2.nomeEstudante ="LALA";
		estudante2.nomeCursoMatriculado = "Engenharia";
		estudante2.idadeEstudante = 50;
		
		System.out.println("Estudante 1 " + estudante1);
		System.out.println("Estudante 2 " + estudante2);
	}

}
