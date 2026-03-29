
import model.Cliente;
import model.Reserva;
import subsistemas.*;

public class ViagemFacade {

    private VooService vooService;
    private HotelService hotelService;
    private TransporteService transporteService;
    private ComprovanteService comprovanteService;
    private NotificacaoService notificacaoService;

    public ViagemFacade(){
        this.vooService = new VooService();
        this.hotelService = new HotelService();
        this.transporteService = new TransporteService();
        this.comprovanteService = new ComprovanteService();
        this.notificacaoService = new NotificacaoService();
    }

    public Reserva reservas(Cliente cliente, String destino){

        vooService.reservarVoo(destino);

        hotelService.reservarHotel(destino);

        transporteService.reservarTransporte(destino);

        Reserva reserva = comprovanteService.gerarReserva(destino);

        notificacaoService.enviarConfirmacao(cliente, reserva);

        return reserva;
    }
}
