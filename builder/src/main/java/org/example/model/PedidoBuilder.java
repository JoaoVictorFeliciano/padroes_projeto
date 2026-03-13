package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {

    private String tipo;
    private String tamanho;
    private String tipoMassa;
    private String tipoPao;
    private String observacoes;
    private String pagamento;
    private String cupom;
    private List<String> itens = new ArrayList<>();
    private String enderecoEntrega;
    private String entrega;
    private Double trocoPara;
    private boolean bordaRecheada;

    public PedidoBuilder tipoHamburguer() {
        this.tipo = "HAMBURGUER";
        return this;
    }

    public PedidoBuilder tipoPizza() {
        this.tipo = "PIZZA";
        return this;
    }

    public PedidoBuilder tamanhoP() {
        this.tamanho = "P";
        return this;
    }

    public PedidoBuilder tamanhoM() {
        this.tamanho = "M";
        return this;
    }

    public PedidoBuilder tamanhoG() {
        this.tamanho = "G";
        return this;
    }

    public PedidoBuilder tipoPao(String pao) {
        this.tipoPao = pao;
        return this;
    }

    public PedidoBuilder tipoMassa(String massa) {
        this.tipoMassa = massa;
        return this;
    }

    public PedidoBuilder comBordaRecheada() {
        this.bordaRecheada = true;
        return this;
    }

    public PedidoBuilder semBordaRecheada() {
        this.bordaRecheada = false;
        return this;
    }

    public PedidoBuilder addItem(String item) {
        this.itens.add(item);
        return this;
    }

    public PedidoBuilder pagarComPix() {
        this.pagamento = "PIX";
        return this;
    }

    public PedidoBuilder pagarComCartao() {
        this.pagamento = "CARTAO";
        return this;
    }

    public PedidoBuilder pagarComDinheiro() {
        this.pagamento = "DINHEIRO";
        return this;
    }

    public PedidoBuilder comTrocoPara(double valor) {
        this.trocoPara = valor;
        return this;
    }

    public PedidoBuilder entregaDelivery(String endereco) {
        this.entrega = "DELIVERY";
        this.enderecoEntrega = endereco;
        return this;
    }

    public PedidoBuilder entregaRetirada() {
        this.entrega = "RETIRADA";
        this.enderecoEntrega = null;
        return this;
    }

    public PedidoBuilder comCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public PedidoBuilder comObservacao(String obs) {
        this.observacoes = obs;
        return this;
    }

    public Pedido build() {

        if (tipo == null)
            throw new IllegalStateException("Tipo não informado");

        if (tamanho == null)
            throw new IllegalStateException("Tamanho não informado");

        if (pagamento == null)
            throw new IllegalStateException("Pagamento não informado");

        if (itens.isEmpty())
            throw new IllegalStateException("Pedido deve ter pelo menos 1 item");

        if (tipo.equals("HAMBURGUER")) {

            if (tipoPao == null)
                throw new IllegalStateException("Hambúrguer exige tipo de pão");

            if (tipoMassa != null)
                throw new IllegalStateException("Hambúrguer não usa massa");

            if (bordaRecheada)
                throw new IllegalStateException("Hambúrguer não tem borda recheada");

        } else if (tipo.equals("PIZZA")) {

            if (tipoMassa == null)
                throw new IllegalStateException("Pizza exige tipo de massa");

            if (tipoPao != null)
                throw new IllegalStateException("Pizza não usa pão");

        } else {
            throw new IllegalStateException("Tipo inválido");
        }

        if ("DELIVERY".equals(entrega)) {

            if (enderecoEntrega == null || enderecoEntrega.isEmpty())
                throw new IllegalStateException("Delivery exige endereço");

        } else if ("RETIRADA".equals(entrega)) {

            if (enderecoEntrega != null)
                throw new IllegalStateException("Retirada não deve ter endereço");

        } else {
            throw new IllegalStateException("Forma de entrega inválida");
        }

        if (!"DINHEIRO".equals(pagamento)) {

            if (trocoPara != null)
                throw new IllegalStateException("Troco só permitido para pagamento em dinheiro");

        } else {
            if (trocoPara != null && trocoPara <= 0)
                throw new IllegalStateException("Troco deve ser maior que zero");
        }

        double trocoFinal = (trocoPara == null) ? 0 : trocoPara;

        return new Pedido(
                tipo,
                tamanho,
                tipoMassa,
                tipoPao,
                observacoes,
                pagamento,
                cupom,
                itens,
                enderecoEntrega,
                entrega,
                trocoFinal,
                bordaRecheada
        );
    }
}