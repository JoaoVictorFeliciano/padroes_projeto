public class Frota implements Setor {

    private String responsavel;
    private int quantidadeVeiculos;
    private boolean manutencaoEmDia;

    public Frota(String responsavel, int quantidadeVeiculos, boolean manutencaoEmDia) {
        this.responsavel = responsavel;
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.manutencaoEmDia = manutencaoEmDia;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    public boolean isManutencaoEmDia() {
        return manutencaoEmDia;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}