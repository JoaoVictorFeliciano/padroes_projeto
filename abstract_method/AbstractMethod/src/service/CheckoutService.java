package service;

import model.FornecedorFactory;
import model.Frete;
import model.NotaFiscal;
import model.Pagamento;

public class CheckoutService {
    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory) {
        this.pagamento = factory.criarPagamento();
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();
    }

    public void finalizarCompra(String pedidoId, double valorProdutos, double pesoKg, String cepDestino) {
        System.out.printf("== CHECKOUT pedido %s ==\n", pedidoId);
        System.out.printf("Frete Calculado: %.1f \n", frete.calcularFrete(pesoKg, cepDestino));
        System.out.println(pagamento.pagar(valorProdutos));
        System.out.printf("NF gerada: %s\n", notaFiscal.emitir(pedidoId, valorProdutos));
        System.out.println("Compra finalizada!");

    }
}