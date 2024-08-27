package exe_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do usuário
        System.out.print("Digite o número do carro: ");
        int numCarro = scanner.nextInt();

        System.out.print("Digite o nome do piloto (um caractere): ");
        char nomePiloto = scanner.next().charAt(0);

        System.out.print("Digite a velocidade máxima do carro: ");
        float velocidadeMaxima = scanner.nextFloat();

        System.out.print("Digite a velocidade mínima do carro: ");
        float velocidadeMinima = scanner.nextFloat();

        // Criando o objeto Carro com os valores fornecidos pelo usuário
        Carro carro = new Carro(numCarro, nomePiloto, velocidadeMaxima, velocidadeMinima);

        // Ligando o carro
        carro.ligar();

        // Acelerando o carro
        carro.acelerar();

        // Solicitando a porcentagem de frenagem
        System.out.print("Digite a porcentagem de frenagem: ");
        float porcentagemFrenagem = scanner.nextFloat();
        carro.frear(porcentagemFrenagem);

        // Parando o carro
        carro.parar();

        // Desligando o carro
        carro.desligar();

        scanner.close();
    }
}