package exe2;

public class Estante {
    private int numeroEstante;

    public Estante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    public void acomodarLivro(Livro livro) {
        System.out.println("Livro " + livro.getTituloLivro() + " acomodado na estante " + numeroEstante);
    }
}
