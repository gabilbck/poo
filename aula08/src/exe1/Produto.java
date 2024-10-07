package exe1;

public class Produto {
    private double precoProduto;
    private int qtdeEstoque;

    public Produto(double precoProduto, int qtdeEstoque) {
        this.precoProduto = precoProduto;
        this.qtdeEstoque = qtdeEstoque;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
}