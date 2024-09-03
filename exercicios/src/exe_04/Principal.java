package exe_04;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int[] canais = {1, 2, 3, 4, 5};
		int op;
		
		ControleRemoto controle = new ControleRemoto(10, canais, 1);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Configurações atuais: " + controle);
		System.out.println("\nDigite quando quiser controlar sua TV:");
		System.out.println("1 - Aumentar Volume");
        System.out.println("2 - Diminuir Volume");
        System.out.println("3 - Próximo Canal");
        System.out.println("4 - Canal Anterior");
		
        while(true) {
        if (scanner.hasNextInt()) {
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    controle.aumentaVolume();
                    System.out.println("Volume aumentado: " + controle.getVolumeTelevisao());
                    break;
                case 2:
                    controle.diminuiVolume();
                    System.out.println("Volume diminuído: " + controle.getVolumeTelevisao());
                    break;
                case 3:
                    controle.proxCanal();
                    System.out.println("Canal atual: " + controle.getCanalAtual());
                    break;
                case 4:
                    controle.anteCanal();
                    System.out.println("Canal atual: " + controle.getCanalAtual());
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Não existe esta opção... :C");
            }
        } else {
            System.out.println("Entrada inválida, por favor insira um número.");
            scanner.next();
        }
		
        }
    }
	
}
