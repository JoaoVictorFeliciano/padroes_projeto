public class EstadoAberto implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Chamado " + chamado.getCodigo() + " entrou em atendimento.");
        chamado.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente com chamado aberto.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não há resposta de cliente para chamado aberto.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado que ainda está aberto.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado " + chamado.getCodigo() + " foi cancelado.");
        chamado.setEstado(new EstadoCancelado());
    }
}