import java.util.*;

public class Main {
    public static void main(String[] args) {


        Relatorio rel1 = new RelatorioFinanceiro(new ExportadorPDF());
        rel1.adicionarItem(new ItemRelatorio("Produto A", 50.0));
        rel1.adicionarItem(new ItemRelatorio("Produto B", 200.0));
        rel1.adicionarItem(new ItemRelatorio("Produto C", 150.0));
        rel1.gerar(false);

        System.out.println();

        Relatorio rel2 = new RelatorioFinanceiro(new ExportadorExcel());
        rel2.adicionarItem(new ItemRelatorio("Produto A", 50.0));
        rel2.adicionarItem(new ItemRelatorio("Produto B", 200.0));
        rel2.adicionarItem(new ItemRelatorio("Produto C", 150.0));
        rel2.gerar(true);

        System.out.println();

        Relatorio rel3 = new RelatorioVendas(new ExportadorPDF());
        rel3.adicionarItem(new ItemRelatorio("Produto A", 50.0));
        rel3.adicionarItem(new ItemRelatorio("Produto B", 200.0));
        rel3.adicionarItem(new ItemRelatorio("Produto C", 150.0));
        rel3.gerar(true);
        
        System.out.println();

        Relatorio rel4 = new RelatorioVendas(new ExportadorExcel());
        rel4.adicionarItem(new ItemRelatorio("Produto A", 50.0));
        rel4.adicionarItem(new ItemRelatorio("Produto B", 200.0));
        rel4.adicionarItem(new ItemRelatorio("Produto C", 150.0));
        rel4.gerar(false);
    }
}