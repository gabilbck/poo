package exerc2;

public class ClienteJuridico extends Cliente {
	private long cnpjCliente;

	public ClienteJuridico(String nomeCliente, String endClienteString, long cnpjCliente) {
		super(nomeCliente, endClienteString);
		this.cnpjCliente =cnpjCliente;
		
	}

	public long getCnpjCliente() {
		return cnpjCliente;
	}

	@Override
	public String toString() {
		return "ClienteJuridico [cnpjCliente=" + cnpjCliente + ", nomeCliente=" + nomeCliente + ", endClienteString="
		    + endClienteString + "]";
	}

}
