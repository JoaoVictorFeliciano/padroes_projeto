public class Administrativo implements Setor {

    private String responsavel;
    private int quantidadeColaboradores;
    private boolean organizado;

    public Administrativo(String responsavel, int quantidadeColaboradores, boolean organizado) {
        this.responsavel = responsavel;
        this.quantidadeColaboradores = quantidadeColaboradores;
        this.organizado = organizado;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadeColaboradores() {
        return quantidadeColaboradores;
    }

    public boolean isOrganizado() {
        return organizado;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}