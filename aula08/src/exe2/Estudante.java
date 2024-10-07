package exe2;

public class Estudante {
    private String nomeEstudante;
    private int matrEstudante;

    public Estudante(String nomeEstudante, int matrEstudante) {
        this.nomeEstudante = nomeEstudante;
        this.matrEstudante = matrEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public int getMatrEstudante() {
        return matrEstudante;
    }

    public void setMatrEstudante(int matrEstudante) {
        this.matrEstudante = matrEstudante;
    }
}
