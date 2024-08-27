package exe_02;
import java.time.LocalDate;

public class Produto {
	//Atributos
	private String nomeProduto;
	private String descProduto;
	private LocalDate dataFabricacao;
	
	//Construtor
	public Produto(String nomeProduto, String descProduto, LocalDate dataFabricacao) {
		this.nomeProduto = nomeProduto;
		this.descProduto = descProduto;
		this.dataFabricacao = dataFabricacao;
	}
	
	//Métodos
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public String getDescProduto() {
		return descProduto;
	}
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	//Sobescreve o método padrão dentro da classe quando definido
	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", descProduto=" + descProduto + ", dataFabricacao="
				+ dataFabricacao + "]";
	}
	
}
