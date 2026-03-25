public class CaldaChocolateDecorator implements Bebida{

    private final Bebida bebida;

    public CaldaChocolateDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public void getDescricao() {
        bebida.getDescricao();
        System.out.print(" + Calda de Chocolate");
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.5;
    }
}
