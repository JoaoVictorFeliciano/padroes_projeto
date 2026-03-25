public class Cappucino implements Bebida{

    @Override
    public void getDescricao() {
        System.out.print("Cappucino");
    }

    @Override
    public double getPreco() {
        return 8.0;
    }
}
