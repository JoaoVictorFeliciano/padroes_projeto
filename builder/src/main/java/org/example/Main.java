package org.example;

import org.example.model.Pedido;
import org.example.model.PedidoBuilder;

public class Main {

    public static void main(String[] args) {

        Pedido p1 = new PedidoBuilder()
                .tipoHamburguer()
                .tipoPao("BRIOCHE")
                .tamanhoM()
                .addItem("X-Bacon")
                .pagarComPix()
                .entregaDelivery("Rua A, 123")
                .comObservacao("Sem cebola")
                .build();
        p1.printResumo();

        Pedido p2 = new PedidoBuilder()
                .tipoPizza()
                .tipoMassa("FINA")
                .tamanhoG()
                .addItem("Pizza Calabresa")
                .comBordaRecheada()
                .pagarComCartao()
                .entregaRetirada()
                .comCupom("10OFF")
                .build();
        p2.printResumo();

        Pedido p3 = new PedidoBuilder()
                .tipoHamburguer()
                .tipoPao("TRADICIONAL")
                .tamanhoP()
                .addItem("X-Salada")
                .pagarComDinheiro()
                .comTrocoPara(100)
                .entregaRetirada()
                .build();
        p3.printResumo();

        try {

            Pedido p4 = new PedidoBuilder()
                    .tipoPizza()
                    .tamanhoM()
                    .addItem("Pizza Mussarela")
                    .pagarComPix()
                    .entregaRetirada()
                    .build();
            p4.printResumo();

        } catch (IllegalStateException e) {

            System.out.println("\nPEDIDO 4 INVALÍDO.");
            System.out.println("Erro: " + e.getMessage());
        }


    }
}