package demonstracao;

public class ClasseExecutora {

	public static void main(String[] args) {
		ProfessorIntegral profInt1 = new ProfessorIntegral(55478, "João Maria", 6500.65f);
		ProfessorHorista profHor1 = new ProfessorHorista(87455, "Maria João",  56.78f, 15);
		
		System.out.println(profInt1);
		
		//mostrar a matricula e o salário professor Integral
		System.out.println(profInt1.matriculaProfessor + " " + profInt1.getValorSalario());
		
		System.out.println(profHor1 + " Salário: " + Math.ceil(profHor1.obterSalario())); 
	}

}
