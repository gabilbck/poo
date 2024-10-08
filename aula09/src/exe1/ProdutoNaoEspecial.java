package exe1;

public class ProdutoNaoEspecial implements Produto {

	public ProdutoNaoEspecial() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco(double precoBase) {
		return precoBase * 0.98;
	}

}
