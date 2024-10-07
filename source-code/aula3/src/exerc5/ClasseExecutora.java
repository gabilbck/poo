package exerc5;
import java.util.Scanner;

public class ClasseExecutora {

	public static void main(String[] args) {
		Scanner entrDados = new Scanner(System.in);
		Reserva reservaEst = new Reserva();
		Reserva reservaProf = new Reserva();
		Reserva reservaCom = new Reserva();
		
		String tpPessoa;

		
	  // instância Reserva Estudante	
		System.out.println("Informe o nome da Pessoa");
		reservaEst.setNomePessoa(entrDados.nextLine()); 
		System.out.println("Informe a classificacão da Pessoa");
		tpPessoa = entrDados.nextLine();
		reservaEst.setTipoPessoa(tpPessoa);
		reservaEst.validarEmprestimo(tpPessoa);
		
	// instância Reserva Professor	
		System.out.println("Informe o nome da Pessoa");
		reservaProf.setNomePessoa(entrDados.nextLine()); 
		System.out.println("Informe a classificacão da Pessoa");
		tpPessoa = entrDados.nextLine();
		reservaProf.setTipoPessoa(tpPessoa);
		reservaProf.validarEmprestimo(tpPessoa);
		
	// instância Reserva Comunidade	
			System.out.println("Informe o nome da Pessoa");
			reservaCom.setNomePessoa(entrDados.nextLine()); 
			System.out.println("Informe a classificacão da Pessoa");
			tpPessoa = entrDados.nextLine();
			reservaCom.setTipoPessoa(tpPessoa);
			reservaCom.validarEmprestimo(tpPessoa);
		
			entrDados.close();
		
			System.out.println(reservaEst);
			System.out.println(reservaProf);
			System.out.println(reservaCom);

	}

}
