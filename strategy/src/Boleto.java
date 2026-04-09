public class Boleto implements Estrategia{

    @Override
    public double pagar(double valor) {
        return (valor * 0.95) + 2;
    }
}
