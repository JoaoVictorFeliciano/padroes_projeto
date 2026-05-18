public class InspecaoSeguranca implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {

        System.out.println("INSPEÇÃO DE SEGURANÇA ARMAZÉM");
        System.out.println("Responsável: " + armazem.getResponsavel());

        if (armazem.isPossuiPendencias()) {
            System.out.println("Pendências encontradas no armazém");
        } else {
            System.out.println("Armazém sem pendências");
        }
        System.out.println();
    }

    @Override
    public void visitar(Administrativo administrativo) {

        System.out.println("INSPEÇÃO DE SEGURANÇA ADMINISTRATIVO");
        System.out.println("Responsável: " + administrativo.getResponsavel());

        if (administrativo.getQuantidadeColaboradores() > 20) {
            System.out.println("Necessário revisar plano de evacuação");
        } else {
            System.out.println("Setor dentro dos padrões de segurança");
        }
        System.out.println();
    }

    @Override
    public void visitar(Frota frota) {

        System.out.println("INSPEÇÃO DE SEGURANÇA FROTA");
        System.out.println("Responsável: " + frota.getResponsavel());

        if (frota.isManutencaoEmDia()) {
            System.out.println("Veículos com manutenção em dia");
        } else {
            System.out.println("Veículos necessitam manutenção");
        }
        System.out.println();
    }

    @Override
    public void visitar(Producao producao) {

        System.out.println("INSPEÇÃO DE SEGURANÇA PRODUÇÃO");
        System.out.println("Responsável: " + producao.getResponsavel());

        if (producao.getNivelRisco() >= 7) {
            System.out.println("Setor de alto risco. Uso de EPIs obrigatório");
        } else {
            System.out.println("Setor com risco controlado");
        }
        System.out.println();
    }
}