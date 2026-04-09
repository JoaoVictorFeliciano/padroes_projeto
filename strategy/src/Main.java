public class Main {
    public static void main(String[] args) {

        Pedido pedidoCartao = new Pedido(200.0, new CartaoCredito());
        System.out.println("Pagamento com Cartão: R$ " + pedidoCartao.calcularTotal());

        System.out.println();

        Pedido pedidoPix = new Pedido(200.0, new Pix());
        System.out.println("Pagamento com Pix: R$ " + pedidoPix.calcularTotal());

        System.out.println();

        Pedido pedidoBoleto = new Pedido(200.0, new Boleto());
        System.out.println("Pagamento com Boleto: R$ " + pedidoBoleto.calcularTotal());

        System.out.println();

        Pedido pedido = new Pedido(200.0, new CartaoCredito());
        pedido.alterarEstrategia(new Pix());
        System.out.println("Alterando forma de pagamento...");
        System.out.println("Novo total com Pix: R$ " + pedido.calcularTotal());
    }
}