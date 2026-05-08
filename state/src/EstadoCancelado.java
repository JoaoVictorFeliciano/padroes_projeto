public class EstadoCancelado implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível atender um chamado cancelado.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Chamado cancelado não pode ser alterado.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Chamado cancelado não pode ser alterado.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Chamado cancelado não pode ser resolvido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado já está cancelado.");
    }
}