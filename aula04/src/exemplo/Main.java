package exemplo;

public class Main {

	public static void main(String[] args) {
		ProfessorHorista profHora = new ProfessorHorista(123, "Cui", 54.40f, 20);
		ProfessorMensalista profMensal = new ProfessorMensalista(456, "Ala", 100f);
		
		System.out.println(profHora);
		System.out.println(profHora.retornaNomeProfessor() + " " + profHora.obterSalario());
		
		System.out.println(profMensal);
	}

}
