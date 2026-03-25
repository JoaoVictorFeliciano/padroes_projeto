public class ChantillyDecorator implements Bebida{

    private final Bebida bebida;

    public ChantillyDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public void getDescricao() {
        bebida.getDescricao();
        System.out.print(" + Chantilly");
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() +3.0;
    }
}
