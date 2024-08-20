package exe_02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que digite um número
        System.out.print("Digite um número inteiro: ");

        // Lê a entrada do usuário e armazena em uma variável
        int numerox = scanner.nextInt();
        
        // Verifica se o número é divisível por 2 ou 3
        if (numerox % 2 == 0) {
            System.out.println(numerox / 2);
        } else if (numerox % 3 == 0) {
            System.out.println(3 * numerox + 1);
        } else {
            System.out.println(numerox);
        }

        // Fecha o scanner
        scanner.close();
    }
}
