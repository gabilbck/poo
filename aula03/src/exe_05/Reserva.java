package exe_05;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private String usuarioReserva;
	private char tipoReserva;
	private LocalDate dataReserva;
	private LocalDate devolucaoReserva;
	
	public Reserva(String usuarioReserva, char tipoReserva) {
		this.usuarioReserva = usuarioReserva;
		this.tipoReserva = tipoReserva;
		this.dataReserva = LocalDate.now();
		devolucao();
	}
	
	private void devolucao() {
		switch(tipoReserva) {
		case 'e': case 'E':
			this.devolucaoReserva = dataReserva.plus(5, ChronoUnit.DAYS); //adiciona x dias, constamte ChronoUnit especifica a qnt de (unidade) DIAS
			break;
		case 'p': case 'P':
			this.devolucaoReserva = dataReserva.plus(3, ChronoUnit.DAYS);
			break;
		case 'c': case 'C':
			this.devolucaoReserva = dataReserva.plus(4, ChronoUnit.DAYS);
			break;
		default:
			System.out.println("Esse não é um tipo válido!");
			this.devolucaoReserva = null;
		}
	}
	
	// Método para exibir as informações da reserva
    public void exibirReserva() {
        if (devolucaoReserva != null) {
            System.out.println("Reserva feita por: " + usuarioReserva);
            System.out.println("Tipo de usuário: " + tipoReserva);
            System.out.println("Data de reserva: " + dataReserva);
            System.out.println("Data de devolução: " + devolucaoReserva);
        }
    }

	public String getUsuarioReserva() {
		return usuarioReserva;
	}

	public char getTipoReserva() {
		return tipoReserva;
	}

	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public LocalDate getDevolucaoReserva() {
		return devolucaoReserva;
	}
}