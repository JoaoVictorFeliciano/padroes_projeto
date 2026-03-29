package model;

public class Reserva {
    protected String destino;
    protected String codigo;

    public Reserva(String destino, String codigo) {
        this.destino = destino;
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public String getCodigo() {
        return codigo;
    }
}