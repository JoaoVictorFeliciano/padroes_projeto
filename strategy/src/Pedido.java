public class Pedido {
    private double valor;
    private Estrategia estrategia;

    public Pedido(double valor, Estrategia estrategia) {
        this.estrategia = estrategia;
        this.valor = valor;
    }

    public double calcularTotal(){
        return estrategia.pagar(valor);
    }

    public void alterarEstrategia(Estrategia novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

}
