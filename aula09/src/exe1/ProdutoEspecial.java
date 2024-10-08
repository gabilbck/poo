package exe1;

public class ProdutoEspecial implements Produto {

	public ProdutoEspecial() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco(double precoBase) {
		return precoBase * 1.08;
	}

}
