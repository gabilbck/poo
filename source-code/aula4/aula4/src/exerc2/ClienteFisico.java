package exerc2;

public class ClienteFisico extends Cliente {
	private long cpfCliente; 

	public ClienteFisico(String nomeCliente, String endClienteString, long cpfCliente) {
		super(nomeCliente, endClienteString);
		this.cpfCliente = cpfCliente;
		
	}

	public long getCpfCliente() {
		return cpfCliente;
	}

	@Override
	public String toString() {
		return "ClienteFisico [cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente + ", endClienteString="
		    + endClienteString + "]";
	}
	
}
