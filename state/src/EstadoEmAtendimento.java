public class EstadoEmAtendimento implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Chamado já está em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Chamado " + chamado.getCodigo() + " aguardando resposta do cliente.");
        chamado.setEstado(new EstadoAguardandoCliente());
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Chamado já está em atendimento.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Chamado " + chamado.getCodigo() + " foi resolvido.");
        chamado.setEstado(new EstadoResolvido());
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado " + chamado.getCodigo() + " foi cancelado.");
        chamado.setEstado(new EstadoCancelado());
    }
}