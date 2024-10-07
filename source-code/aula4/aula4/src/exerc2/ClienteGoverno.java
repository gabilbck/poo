package exerc2;

public class ClienteGoverno extends Cliente {
	private long regGovCliente;

	public ClienteGoverno(String nomeCliente, String endClienteString, long regGovCliente) {
		super(nomeCliente, endClienteString);
		this.regGovCliente = regGovCliente;
	}

	public long getRegGovCliente() {
		return regGovCliente;
	}

	@Override
	public String toString() {
		return "ClienteGoverno [regGovCliente=" + regGovCliente + ", nomeCliente=" + nomeCliente + ", endClienteString="
		    + endClienteString + "]";
	}

}
