package model;

import observer.PedidoObserver;
import observer.PedidoSubject;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {
    private String id;
    private String status;
    private Cliente cliente;
    private List<PedidoObserver> observers;

    public Pedido(String id, String status, Cliente cliente) {
        this.id = id;
        this.status = status;
        this.cliente = cliente;
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(PedidoObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (PedidoObserver observer : observers) {
            observer.atualizar(this);
        }
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isEmpty()) {
            throw new IllegalArgumentException("Status inválido");
        }
        this.status = novoStatus;
        notificarObservers();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<PedidoObserver> observers) {
        this.observers = observers;
    }
}
