package internacional;

import model.Pagamento;

public class PagamentoInternacional implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[INTERNACIONAL] pagamento com taxa");
        return true;
    }
}
