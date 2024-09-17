package exercicio1;

public class ProdutoKilo extends Produto {
	private float qtdKiloProduto;
	private float vlrKiloProduto;
	
	public ProdutoKilo(String produtoSKU, String produtoDesc, float qtdKiloProduto, float vlrKiloProduto) {
		super(produtoSKU, produtoDesc);
		this.qtdKiloProduto = qtdKiloProduto;
		this.vlrKiloProduto = vlrKiloProduto;
	}

	public float getQtdKiloProduto() {
		return qtdKiloProduto;
	}
	
	public float getVlrKiloProduto() {
		return vlrKiloProduto;
	}

	public float calcularPreco() {
		return getQtdKiloProduto() * getVlrKiloProduto();
	}
}
