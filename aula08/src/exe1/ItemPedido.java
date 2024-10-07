package exe1;

public class ItemPedido {
    private int qtdeItem;
    private Produto produto;

    public ItemPedido(int qtdeItem, Produto produto) {
        this.qtdeItem = qtdeItem;
        this.produto = produto;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularTotalItem() {
        return qtdeItem * produto.getPrecoProduto();
    }
}