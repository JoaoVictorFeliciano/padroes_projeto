import model.Cliente;

public class Main{
    public static void main(String[] args){

        ViagemFacade viagemFacade = new ViagemFacade();

        Cliente cliente1 = new Cliente("João", "joao@email.com");
        viagemFacade.reservas(cliente1, "Recife");

        System.out.println();

        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        viagemFacade.reservas(cliente2, "São Paulo");

    }
}