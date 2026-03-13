package org.example.model;

import java.util.List;

public class Pedido {

    private final String tipo;
    private final String tamanho;
    private final String massa;
    private final String pao;
    private final String observacoes;
    private final String pagamento;
    private final String cupom;
    private final List<String> itens;
    private final String endereco;
    private final String entrega;
    private final double trocoPara;
    private final boolean bordaRecheada;

    public Pedido(String tipo, String tamanho, String massa, String pao, String observacoes,
                  String pagamento, String cupom, List<String> itens, String endereco, String entrega,
                  double trocoPara, boolean bordaRecheada){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.massa = massa;
        this.pao = pao;
        this.observacoes = observacoes;
        this.pagamento = pagamento;
        this.cupom = cupom;
        this.itens = itens;
        this.endereco = endereco;
        this.entrega = entrega;
        this.trocoPara = trocoPara;
        this.bordaRecheada = bordaRecheada;
    }

    public void printResumo() {

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Itens: " + itens);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Entrega: " + entrega);
        System.out.println("Endereço: " + endereco);

        if (pao != null)
            System.out.println("Pão: " + pao);

        if (massa != null)
            System.out.println("Massa: " + massa);

        if (bordaRecheada)
            System.out.println("Borda recheada: SIM");

        if (trocoPara != 0)
            System.out.println("Troco para: " + trocoPara);

        if (cupom != null)
            System.out.println("Cupom: " + cupom);

        if (observacoes != null)
            System.out.println("Observação: " + observacoes);
    }
}