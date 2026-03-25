
public class Main{
    public static void main(String[] args){

        Bebida cafe = new Cafe();
        Bebida cafeLeite = new LeiteExtraDecorator(cafe);
        cafeLeite.getDescricao();
        System.out.println("\nPreço R$: " + cafeLeite.getPreco());

        System.out.println();

        Bebida capuccino = new Cappucino();
        Bebida capuccinoEspecial = new ChantillyDecorator(new CanelaDecorator(capuccino));
        capuccinoEspecial.getDescricao();
        System.out.println("\nPreço R$:" + capuccinoEspecial.getPreco());

        System.out.println();

        Bebida chocolateQuente = new ChocolateQuente();
        Bebida ChocoEspecial = new LeiteExtraDecorator(new ChantillyDecorator(new CaldaChocolateDecorator(chocolateQuente)));
        ChocoEspecial.getDescricao();
        System.out.println("\nPreço R$:" + ChocoEspecial.getPreco());


    }



}