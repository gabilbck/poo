package exerc2;

public abstract class Cliente {
	protected String nomeCliente;
	protected String endClienteString;
	
	public Cliente(String nomeCliente, String endClienteString) {
		this.nomeCliente = nomeCliente;
		this.endClienteString = endClienteString;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEndClienteString() {
		return endClienteString;
	}

	
}
