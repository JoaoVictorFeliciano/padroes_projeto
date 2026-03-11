package nacional;

import model.Pagamento;

public class PagamentoNacional implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[NACIONAL] pagamento aprovado.");
        return true;
    }
}
