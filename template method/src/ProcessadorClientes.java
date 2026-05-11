public class ProcessadorClientes extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando estrutura do arquivo de clientes");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados de clientes: nome, CPF, email e telefone");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando dados dos clientes");
    }
}