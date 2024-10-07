package exerc01;

public class ProdutoKilo extends Produto {
	private float qteKiloProduto;
	private float vlrKiloProduto;

	public ProdutoKilo(String produtoSKU, String produtoDesc, float qteKiloProduto, float vlrKiloProduto) {
		super(produtoSKU, produtoDesc);
		this.qteKiloProduto = qteKiloProduto;
		this.vlrKiloProduto = vlrKiloProduto;
	}

	public float getQteKiloProduto() {
		return qteKiloProduto;
	}

	public float getVlrKiloProduto() {
		return vlrKiloProduto;
	}
	
	public float calcularPreco() {
		return getQteKiloProduto() * getVlrKiloProduto();
	}

}
