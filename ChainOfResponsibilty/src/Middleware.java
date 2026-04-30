public abstract class Middleware {
    protected Middleware proximo;
    public abstract boolean processar(Requisicao req);

    public void setProximo(Middleware proximo) {
        this.proximo = proximo;
    }
}
