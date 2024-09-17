package exercicio1;

public class ProdutoUnitario extends Produto {
	private int qtdUniProduto;
	private float vlrUniProduto;
	
	public ProdutoUnitario(String produtoSKU, String produtoDesc, int qtdUniProduto, float vlrUniProduto) {
		super(produtoSKU, produtoDesc);
		this.qtdUniProduto = qtdUniProduto;
		this.vlrUniProduto = vlrUniProduto;
	}
	
	public int getQtdUniProduto() {
		return qtdUniProduto;
	}
	
	public float getVlrUniProduto() {
		return vlrUniProduto;
	}
	
	public float calcularPreco() {
		return getQtdUniProduto() * getVlrUniProduto();                                
	}
}
