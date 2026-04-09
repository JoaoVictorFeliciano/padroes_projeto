public class CartaoCredito implements Estrategia{

    @Override
    public double pagar(double valor) {
        return valor * 1.05;
    }

}
