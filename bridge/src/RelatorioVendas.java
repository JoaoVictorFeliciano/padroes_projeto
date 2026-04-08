public class RelatorioVendas extends Relatorio{

    String titulo = "Relátorio Vendas";

    public RelatorioVendas(Exportador exportador) {
        super(exportador);

    }

    @Override
    public void gerar(boolean detalhado) {
        itemRelatorioList = this.filtrarDetalhados(detalhado);
        exportador.exportar(titulo, itemRelatorioList, calcularTotal());
    }
}
