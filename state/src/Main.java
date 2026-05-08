public class Main {
    public static void main(String[] args) {

        System.out.println("1-");
        Chamado c1 = new Chamado(
                "001",
                "Computador não pega",
                "João"
        );
        c1.resolver();
        c1.iniciarAtendimento();
        c1.aguardarCliente();
        c1.resolver();
        c1.responderCliente();
        c1.resolver();
        c1.cancelar();
        
        System.out.println();

        System.out.println("2-");
        Chamado c2 = new Chamado(
                "002",
                "Internet não pega",
                "Maria"
        );
        c2.cancelar();
        c2.iniciarAtendimento();
    }
}