package exe_04;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int op;
		
		ControleRemoto controle = new ControleRemoto(10, 1);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Configurações atuais:\nVol: " + controle.getVolumeTelevisao() + "      Canal: " + controle.getCanalTelevisao());
		System.out.println("\nBotões (digitos) para controlar sua TV:");
		System.out.println("1 - Aumentar Volume");
        	System.out.println("2 - Diminuir Volume");
        	System.out.println("3 - Próximo Canal");
        	System.out.println("4 - Canal Anterior");
        	System.out.println("5 - Consultar Volume");
        	System.out.println("6 - Consultar Canal");
        	System.out.println("7 - Digitar Canal");
        	System.out.println("8 - Desligar controle");
        
        while(true) {
        	System.out.println("\n''Pressione'' o botão:\n");
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
	                    System.out.println("Canal sucessor: " + controle.getCanalTelevisao());
	                    break;
	                case 4:
	                    controle.anteCanal();
	                    System.out.println("Canal antecessor: " + controle.getCanalTelevisao());
	                    break;
	                case 5:
	                    controle.retornaVolumeAtual();
	                    System.out.println("Volume atual: " + controle.getVolumeTelevisao());
	                    break;
	                case 6:
	                    controle.retornaCanalAtual();
	                    System.out.println("Canal atual: " + controle.getCanalTelevisao());
	                    break;
	                case 7:
	                    System.out.println("Canal atual: " + controle.mudaCanalTelevisao() + "\n");
	                    break;
	                case 8:
	                    System.out.println("Saindo do programa...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Não existe esta opção... :C");
	                    break;
	            }
	        } else {
	            System.out.println("Entrada inválida, por favor insira um número.");
	            scanner.next();
	        }
        }
    }
}
