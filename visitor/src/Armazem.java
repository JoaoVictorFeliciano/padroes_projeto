public class Armazem implements Setor {
    private String responsavel;
    private int quantidadeEquipamentos;
    private boolean possuiPendencias;

    public Armazem(String responsavel, int quantidadeEquipamentos, boolean possuiPendencias) {
        this.responsavel = responsavel;
        this.quantidadeEquipamentos = quantidadeEquipamentos;
        this.possuiPendencias = possuiPendencias;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    public boolean isPossuiPendencias() {
        return possuiPendencias;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}