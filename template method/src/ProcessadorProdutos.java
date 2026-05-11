public class ProcessadorProdutos extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando estrutura do arquivo de produtos");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados de produtos: código, descrição, preço e estoque");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando dados dos produtos");
    }
}