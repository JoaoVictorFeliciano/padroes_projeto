import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Questao Q1 = new Questao(1, "1- sgsgsg", 3);
        Questao Q2 = new Questao(2, "2- adadad", 3);
        Questao Q3 = new Questao(3, "3- fdfdfd", 4);

        List<Questao> addquestoes = new ArrayList<>();
        addquestoes.add(Q1);
        addquestoes.add(Q2);
        addquestoes.add(Q3);

        Prova template = new Prova(
                "Prova SQL - Template",
                "TEMPLATE",
                "2026-03-10",
                "BASE",
                addquestoes
        );

        System.out.println("=== TEMPLATE ===");
        template.printResumo();


        Prova prova1 = template.copiar();
        prova1.setTurma("2 INFO A");
        prova1.setData("2026-03-20");
        prova1.setVersao("V1");

        Questao Q2_versao = new Questao(2, "2- NOVA QUESTAO", 5);
        prova1.substituirQuestao(2, Q2_versao);

        System.out.println("\n=== PROVA 1 ===");
        prova1.printResumo();


        Prova prova2 = template.copiar();
        prova2.setTurma("2 INFO B");
        prova2.setData("2026-03-21");
        prova2.setVersao("V1");

        Questao Q3_versao = new Questao(3, "3- ALTERADA", 5);
        prova2.substituirQuestao(3, Q3_versao);

        System.out.println("\n=== PROVA 2 ===");
        prova2.printResumo();



        System.out.println("\n=== ALTERANDO Q1 DA PROVA 1 ===");

        Questao novaQ1 = new Questao(1, "1- ALTERADA NA PROVA 1", 3);
        prova1.substituirQuestao(1, novaQ1);

        System.out.println("\nTEMPLATE (não pode mudar):");
        template.printResumo();

        System.out.println("\nPROVA 1 (alterada):");
        prova1.printResumo();
    }
}