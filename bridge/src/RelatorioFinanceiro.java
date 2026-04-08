public class RelatorioFinanceiro extends Relatorio{

    String titulo = "Relátorio Financeiro";

    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        itemRelatorioList = this.filtrarDetalhados(detalhado);
        exportador.exportar(titulo, itemRelatorioList, this.calcularTotal());
    }
}
