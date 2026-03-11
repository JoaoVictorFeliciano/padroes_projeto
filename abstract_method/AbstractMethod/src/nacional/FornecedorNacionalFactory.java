package nacional;

import model.FornecedorFactory;
import model.Frete;
import model.NotaFiscal;
import model.Pagamento;

public class FornecedorNacionalFactory implements FornecedorFactory {

    @Override
    public Pagamento criarPagamento() {
        return  new PagamentoNacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNacional();
    }
}
