package exe1;

public class Main {
	public static void main(String[] args) {
		Produto produtoEspecial = new ProdutoEspecial();
        Produto produtoNaoEspecial = new ProdutoNaoEspecial();

        double precoBase = 100.0;
        System.out.println("Preço do Produto Especial: " + produtoEspecial.calcularPreco(precoBase));
        System.out.println("Preço do Produto Não Especial: " + produtoNaoEspecial.calcularPreco(precoBase));
	}

}
