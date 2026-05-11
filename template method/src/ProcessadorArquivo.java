public abstract class ProcessadorArquivo {

    public final void processarArquivo() {
        abrirArquivo();
        validarEstrutura();
        lerDados();
        processarDados();
        salvarResultado();
        fecharArquivo();
    }

    private void abrirArquivo() {
        System.out.println("Abrindo arquivo");
    }

    private void salvarResultado() {
        System.out.println("Salvando resultado");
    }

    private void fecharArquivo() {
        System.out.println("Fechando arquivo");
    }

    protected abstract void validarEstrutura();

    protected abstract void lerDados();

    protected abstract void processarDados();
}