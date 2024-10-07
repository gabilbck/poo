package exerc2;

import java.time.LocalDate;

public class Produto {
	 private String nomeProduto;
	 private String descrProduto;
	 private LocalDate dataFabricacao;
	
	public Produto(String nomeProduto, String descrProduto, LocalDate dataFabricacao) {
		this.nomeProduto = nomeProduto;
		this.descrProduto = descrProduto;
		this.dataFabricacao = dataFabricacao;
	}

	public String getNomeProduto() {
		return nomeProduto;
  }

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescrProduto() {
		return descrProduto;
	}

	public void setDescrProduto(String descrProduto) {
		this.descrProduto = descrProduto;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", descrProduto=" + descrProduto + ", dataFabricacao="
		    + dataFabricacao + "]";
	}
	
	
}
