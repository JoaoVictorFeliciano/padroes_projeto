public class ChocolateQuente implements Bebida{

    @Override
    public void getDescricao() {
        System.out.print("Chocolate Quente");
    }

    @Override
    public double getPreco() {
        return 7.0;
    }
}
