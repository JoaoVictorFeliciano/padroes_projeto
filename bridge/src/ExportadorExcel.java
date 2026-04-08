import java.util.List;

public class ExportadorExcel implements Exportador{

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.println(titulo);
        for(int i = 0; i < itens.size(); i++){
            System.out.println(itens.get(i).descricao + ";" + itens.get(i).valor);
        }
        System.out.println("...");
        System.out.println("TOTAL; " + total);
        System.out.println("======================");

    }
}
