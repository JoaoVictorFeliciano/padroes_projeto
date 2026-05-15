public class Medico extends Participante {

    public Medico(MediadorClinica mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("\nMÉDICO");
        System.out.println(nome + " envia mensagem: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("\nMÉDICO");
        System.out.println(nome + " recebeu mensagem: " + mensagem);
    }
}
