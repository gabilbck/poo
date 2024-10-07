package exerc01;

public class ProdutoUnitario extends Produto {
	private int qtdeUnitProduto;
	private float vlrUnidProduto;

	public ProdutoUnitario(String produtoSKU, String produtoDesc, int qtdeUnitProduto, float vlrUnidProduto) {
		super(produtoSKU, produtoDesc);
		this.qtdeUnitProduto = qtdeUnitProduto;
		this.vlrUnidProduto = vlrUnidProduto;
	}

	public int getQtdeUnitProduto() {
		return qtdeUnitProduto;
	}

	public float getVlrUnidProduto() {
		return vlrUnidProduto;
	}
	
	public float calcularPreco() {
		return getQtdeUnitProduto() * getVlrUnidProduto();
	}

}
