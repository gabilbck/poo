package exe2;

public class Capitulo {
    private int numCapitulo;
    private String tituloCapitulo;

    public Capitulo(int numCapitulo, String tituloCapitulo) {
        this.numCapitulo = numCapitulo;
        this.tituloCapitulo = tituloCapitulo;
    }

    public int getNumCapitulo() {
        return numCapitulo;
    }

    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }

    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }
}
