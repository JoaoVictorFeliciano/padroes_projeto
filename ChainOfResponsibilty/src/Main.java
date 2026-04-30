public class Main {
    public static void main(String[] args) {

        Middleware auth = new AuthMidleware();
        Middleware permissao = new PermissaoMidleware();
        Middleware validacao = new ValidacaoMidleware();
        Middleware log = new LogMidleware();
        Middleware controller = new ControllerMidleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("CENÁRIO 1:");

        Requisicao req1 = new Requisicao("admin", "valido", "ADMIN", true);
        auth.processar(req1);

        System.out.println("\nCENÁRIO 2:");

        Requisicao req2 = new Requisicao("user", "invalido", "ADMIN", true);
        auth.processar(req2);

        System.out.println("\nCENÁRIO 3:");

        Requisicao req3 = new Requisicao("user", "valido", "USER", true);
        auth.processar(req3);


        System.out.println("\nCENÁRIO 4:");
        Requisicao req4 = new Requisicao("user", "valido", "ADMIN", false);
        auth.processar(req4);
    }
}