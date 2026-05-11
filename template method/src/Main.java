public class Main {

    public static void main(String[] args) {

        System.out.println("Processamento de clientes");
        ProcessadorArquivo clientes = new ProcessadorClientes();
        clientes.processarArquivo();

        System.out.println();

        System.out.println("Processamento de produtos");
        ProcessadorArquivo produtos = new ProcessadorProdutos();
        produtos.processarArquivo();

        System.out.println();

        System.out.println("Processamento de vendas");
        ProcessadorArquivo vendas = new ProcessadorVendas();
        vendas.processarArquivo();
    }
}