package desafio;
import java.util.List;

public class Condutor {
	private String nomeCondutor;
	private long cpfCondutor;
	private long foneCondutor;
	private List<Veiculo> veiculos;
	
	public Condutor(String nomeCondutor, long cpfCondutor, long foneCondutor, List<Veiculo> veiculos) {
		this.nomeCondutor = nomeCondutor;
		this.cpfCondutor = cpfCondutor;
		this.foneCondutor = foneCondutor;
		this.veiculos = veiculos;
	}

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public long getCpfCondutor() {
		return cpfCondutor;
	}

	public long getFoneCondutor() {
		return foneCondutor;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	@Override
	public String toString() {
		return "Condutor [nomeCondutor=" + nomeCondutor + ", cpfCondutor=" + cpfCondutor + ", foneCondutor=" + foneCondutor
		    + ", veiculos=" + veiculos + "]";
	}
	
	
	
	
	

}
