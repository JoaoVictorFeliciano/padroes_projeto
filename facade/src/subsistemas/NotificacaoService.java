package subsistemas;

import model.Cliente;
import model.Reserva;

public class NotificacaoService {

    public void enviarConfirmacao(Cliente cliente, Reserva reserva){
        System.out.println("Confirmação enviada para o email " + cliente.getEmail() + "com código " + reserva.getCodigo() );
    }
}
