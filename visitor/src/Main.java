import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Setor> setores = new ArrayList<>();

        setores.add(new Armazem(
                "Carlos",
                60,
                true));

        setores.add(new Administrativo(
                "Fernanda",
                25,
                false));

        setores.add(new Frota(
                "Ricardo",
                15,
                true));

        setores.add(new Producao(
                "João",
                8,
                40));

        VisitanteSetor inspecaoSeguranca = new InspecaoSeguranca();
        VisitanteSetor avaliacaoLimpeza = new AvaliacaoLimpeza();

        System.out.println("INSPEÇÃO DE SEGURANÇA");
        for (Setor setor : setores) {
            setor.aceitar(inspecaoSeguranca);
        }

        System.out.println("AVALIAÇÃO DE LIMPEZA");
        for (Setor setor : setores) {
            setor.aceitar(avaliacaoLimpeza);
        }
    }
}