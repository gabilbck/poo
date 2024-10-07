package exerc01;

public class ClasseExecutora {

	public static void main(String[] args) {
		ProdutoGranel granel = new ProdutoGranel(null, null, 1.5f, 250.50f);
		ProdutoUnitario unitario = new ProdutoUnitario(null, null, 5, 20.30f);
		ProdutoKilo kilo = new ProdutoKilo(null, null, 4.5f, 2.00f);
		
		System.out.println("Granel " + granel.produtoSKU + " " + granel.produtoDesc + " " + granel.calcularPreco());
		System.out.println("Unitário " + unitario.produtoSKU + " " + unitario.produtoDesc + " " + unitario.calcularPreco());
		System.out.println("Kilo " + kilo.produtoSKU + " " + kilo.produtoDesc + " " + kilo.calcularPreco());
	

	}

}
