public class LeiteExtraDecorator implements Bebida{

    private final Bebida bebida;

    public LeiteExtraDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public void getDescricao() {
        bebida.getDescricao();
        System.out.print(" + Leite Extra");
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}
