public class CanelaDecorator implements Bebida{

    private final Bebida bebida;

    public CanelaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public void getDescricao() {
        bebida.getDescricao();
        System.out.print(" + Canela");
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}
