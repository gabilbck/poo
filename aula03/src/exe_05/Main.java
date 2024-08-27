package exe_05;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando as reservas
        Reserva[] reservas = {
            new Reserva("Fulana", 'p'),
            new Reserva("Ciclana", 'c'),
            new Reserva("Beltrana", 'E')
        };

        // Iterando sobre o array de reservas e exibindo as informações
        for (Reserva reserva : reservas) {
            if (reserva.getDevolucaoReserva() != null) {
                System.out.println("Usuário: " + reserva.getUsuarioReserva());
                System.out.println("Tipo de Reserva: " + reserva.getTipoReserva());
                System.out.println("Data da Reserva: " + reserva.getDataReserva());
                System.out.println("Data de Devolução: " + reserva.getDevolucaoReserva());
            } else {
                System.out.println("Reserva não válida para o usuário: " + reserva.getUsuarioReserva());
            }
            System.out.println("------------------------------");
        }
    }
}