public class Cafe implements Bebida{

    @Override
    public void getDescricao() {
        System.out.print("Café");
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
