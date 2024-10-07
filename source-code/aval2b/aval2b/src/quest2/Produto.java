package quest2;

public class Produto {
	private String nomeProduto;
	private float qtdEstoqueProduto;
	private float precoProduto;
	private Boolean produtoAtivo;
	
	public Produto(String nomeProduto, float qtdEstoqueProduto, float precoProduto, Boolean produtoAtivo) {
		this.nomeProduto = nomeProduto;
		this.qtdEstoqueProduto = qtdEstoqueProduto;
		this.precoProduto = precoProduto;
		this.produtoAtivo = produtoAtivo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public float getQtdEstoqueProduto() {
		return qtdEstoqueProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public Boolean getProdutoAtivo() {
		return produtoAtivo;
	}
	
	public void setQtdEstoqueProduto(float qtdEstoqueProduto) {
		this.qtdEstoqueProduto = qtdEstoqueProduto;
	}
	
	public void alterarPrecoInativo() {
		if (!getProdutoAtivo()) {
			if(getQtdEstoqueProduto() > 15) {
				this.precoProduto = (getPrecoProduto() - (getPrecoProduto() * 0.35f));
			}	
			else {
				this.precoProduto = (getPrecoProduto() - (getPrecoProduto() * 0.25f));
				}
			}
		else {
			System.out.println("Produto Ativo Regra não aplicada");
		}
	}
	
	public void alterarPrecoAtivo() {
		if (getProdutoAtivo()) {
			if (getQtdEstoqueProduto() <= 10) {
				this.precoProduto -= (getPrecoProduto() * 0.10f);
			}
			else if ((getQtdEstoqueProduto() > 10) && (getQtdEstoqueProduto() < 40)) {
				this.precoProduto -= (getPrecoProduto() * 0.13f);
			}
			else {
				this.precoProduto -= (getPrecoProduto() * 0.18f);
			}
		}
		else {
			System.out.println("Produto Inativo Regra não aplicada");
		}
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto= " + nomeProduto + ", qtdEstoqueProduto= " + qtdEstoqueProduto + ", precoProduto= "
		    + precoProduto + ", produtoAtivo= " + produtoAtivo + "]";
	}


}
