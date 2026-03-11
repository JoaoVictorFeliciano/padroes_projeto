package internacional;

import model.FornecedorFactory;
import model.Frete;
import model.NotaFiscal;
import model.Pagamento;
import nacional.FreteNacional;

public class FornecedorInternacionalFactory implements FornecedorFactory {

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInternacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInternacional();
    }
}
