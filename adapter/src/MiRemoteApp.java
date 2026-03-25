public class MiRemoteApp {

    private final ControleUniversal dispositivo;

    public MiRemoteApp(ControleUniversal dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void Assitir(){
        dispositivo.ligar();
        dispositivo.aumentarVolume();
        System.out.println("[Mi Remote] Pronto! Assistindo...");
    }

    public void Desligar(){
        dispositivo.desligar();
        dispositivo.diminuirVolume();
        System.out.println("[Mi Remote] Encerrado.");
    }

}
