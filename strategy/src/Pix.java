public class Pix implements Estrategia{

    @Override
    public double pagar(double valor) {
        return  valor - (valor * 0.10);
    }
}
