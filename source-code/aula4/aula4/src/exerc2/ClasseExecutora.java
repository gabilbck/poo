package exerc2;

public class ClasseExecutora {

	public static void main(String[] args) {
		ClienteFisico clienteF = new ClienteFisico("Luiz C Camargo", "Joinville-SC", 18363403032L);
		ClienteJuridico clienteJ = new ClienteJuridico("Java Bom e POO S/A", "São Paulo", 60952896000130l);
		ClienteGoverno clienteG =  new ClienteGoverno("Linha de Código Autarquia", "Araquari", 898777669);
		
		System.out.println(clienteF);
		System.out.println(clienteJ);
		System.out.println(clienteG);
	
	
	
	}

}
