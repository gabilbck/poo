package exerc01;

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


	@Override
	public String toString() {
		return "ProdutoGranel [tonelProduto=" + tonelProduto + ", vlrTonelProduto=" + vlrTonelProduto + ", produtoSKU="
		    + produtoSKU + ", produtoDesc=" + produtoDesc + "]";
	}
	
	

}
