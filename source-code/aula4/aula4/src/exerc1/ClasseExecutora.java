package exerc1;

public class ClasseExecutora {

	public static void main(String[] args) {
		ProfessorHorista profhora = new ProfessorHorista(0001, "José", "Doutorado", 20);
		System.out.println(profhora.getNomeProfessor());
		System.out.println(profhora.getTitulacaoProfessor());
		System.out.println(profhora.getCargaHoraria() + " " + profhora.getValorHora());
		System.out.println(profhora.calcSalario());
		
		ProfessorMensalista profmes = new ProfessorMensalista(0002, "Maria", "Mestrado"); 
		System.out.println(profmes.getNomeProfessor());
		System.out.println(profmes.getTitulacaoProfessor());
		System.out.println(profmes.getCargaHoraria() + " " + profmes.getValorHora());
		System.out.println(profmes.calcSalario());
	}

}
