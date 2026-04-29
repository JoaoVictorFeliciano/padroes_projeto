package service;

import model.Pedido;
import observer.PedidoObserver;

public class FaturamentoService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        String status = pedido.getStatus();

        if ("PAGO".equals(status)) {
            System.out.println("FATURAMENTO: Gerando lançamento financeiro do pedido "
                    + pedido.getId());
        } else if ("CANCELADO".equals(status)) {
            System.out.println("FATURAMENTO: Estornando valores do pedido "
                    + pedido.getId());
        }
    }
}