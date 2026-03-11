package model;

public interface FornecedorFactory {
    Pagamento criarPagamento();
    Frete criarFrete();
    NotaFiscal criarNotaFiscal();

}
