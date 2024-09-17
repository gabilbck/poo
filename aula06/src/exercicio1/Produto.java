package exercicio1;

public abstract class Produto {
	protected String produtoSKU;
	protected String produtoDesc;
	
	public Produto(String produtoSKU, String produtoDesc) {
		this.produtoSKU = produtoSKU;
		this.produtoDesc = produtoDesc;
	}
	
	public float calcularPreco() {
		return 0.0f;
	}
	
	public String obterDadosProduto() {
		return produtoSKU + produtoDesc;
	}
}
