public class ProcessadorVendas extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando estrutura do arquivo de vendas");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados de vendas: data, produto, quantidade e valor total");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando dados das vendas");
    }
}
