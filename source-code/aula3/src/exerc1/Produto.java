package exerc1;
import java.time.LocalDate;

public class Produto {
	 String nomeProduto;
	 String descrProduto;
	 LocalDate dataFabricacao;

	public Produto() {
		
	}
	@Override
	public String toString() {
		return nomeProduto + descrProduto + dataFabricacao;
		
	}
}
