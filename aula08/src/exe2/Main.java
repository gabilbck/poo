package exe2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estante estante = new Estante(1);
        Livro livro = new Livro("Programação em Java", 12345);
        Capitulo capitulo1 = new Capitulo(1, "Introdução");
        Capitulo capitulo2 = new Capitulo(2, "Classes e Objetos");

        livro.adicionarCapitulo(capitulo1);
        livro.adicionarCapitulo(capitulo2);
        estante.acomodarLivro(livro);

        Estudante estudante = new Estudante("Maria", 202012345);

        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), estudante, livro);
        System.out.println("Emprestimo realizado para: " + emprestimo.getEstudante().getNomeEstudante());
    }
}
