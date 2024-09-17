package exercicio1;

public class ProdutoGranel extends Produto {
	private float tonelProduto;
	private float vlrTonelProduto;

	public ProdutoGranel(String produtoSKU, String produtoDesc, float tonelProduto, float vlrTonelProduto) {
		super(produtoSKU, produtoDesc);
		this.tonelProduto = tonelProduto;
		this.vlrTonelProduto = vlrTonelProduto;
	}

	public float getTonelProduto() {
		return tonelProduto;
	}

	public float getVlrTonelProduto() {
		return vlrTonelProduto;
	}
	
	public float calcularPreco() {
		return getTonelProduto() * getVlrTonelProduto();
	}
}
