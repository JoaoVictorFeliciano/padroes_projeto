package subsistemas;

import model.Reserva;

public class ComprovanteService {

    public Reserva gerarReserva(String destino){
        Reserva reserva = new Reserva(destino, "CASA 7");
        System.out.println("Comprovante gerado");
        return reserva;
    }
}
