import java.util.List;


public class ExportadorPDF implements Exportador {

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===");
        System.out.println("Título: " + titulo);
        for(int i = 0; i < itens.size(); i++){
            System.out.println(itens.get(i).descricao + "|" + "R$: " + itens.get(i).valor);
        }
        System.out.println("...");
        System.out.println("Total: " + total);
        System.out.println("======================");

    }
}
