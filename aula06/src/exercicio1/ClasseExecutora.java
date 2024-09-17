package exercicio1;

public class ClasseExecutora {

	public static void main(String[] args) {
		ProdutoGranel granel = new ProdutoGranel("Farinha", "Farinha de Trigo", 1.5f, 800.00f);
		ProdutoUnitario unit = new ProdutoUnitario("Oleo", "Oleo de algodao", 5, 12.50f);
		ProdutoKilo kilo = new ProdutoKilo("panceta", "panceta pata negra", 4.5f, 80.00f);
		
		System.out.println("Granel: " + granel.obterDadosProduto() + granel.calcularPreco());
		System.out.println("Unitariuo: " + unit.obterDadosProduto() + unit.calcularPreco());
		System.out.println("Kilo: " + kilo.obterDadosProduto() + kilo.calcularPreco());
	}

}
