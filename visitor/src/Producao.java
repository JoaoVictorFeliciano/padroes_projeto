public class Producao implements Setor {

    private String responsavel;
    private int nivelRisco;
    private int quantidadeFuncionarios;

    public Producao(String responsavel, int nivelRisco, int quantidadeFuncionarios) {
        this.responsavel = responsavel;
        this.nivelRisco = nivelRisco;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}