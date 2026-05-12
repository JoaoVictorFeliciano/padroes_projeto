public class FilaAtendimentoIterator implements IteratorSenha {

    private FilaAtendimento fila;
    private int posicaoAtual;

    public FilaAtendimentoIterator(FilaAtendimento fila) {
        this.fila = fila;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean temProximo() {
        return posicaoAtual < fila.getSenhas().size();
    }

    @Override
    public SenhaAtendimento proximo() {
        SenhaAtendimento senha = fila.getSenhas().get(posicaoAtual);
        posicaoAtual++;
        return senha;
    }
}