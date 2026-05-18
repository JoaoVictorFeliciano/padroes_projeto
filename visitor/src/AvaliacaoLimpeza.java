public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {

        System.out.println("AVALIAÇÃO DE LIMPEZA ARMAZÉM");

        if (armazem.getQuantidadeEquipamentos() > 50) {
            System.out.println("Necessária limpeza reforçada dos equipamentos");
        } else {
            System.out.println("Limpeza do armazém adequada");
        }
        System.out.println();
    }

    @Override
    public void visitar(Administrativo administrativo) {

        System.out.println("AVALIAÇÃO DE LIMPEZA ADMINISTRATIVO");

        if (administrativo.isOrganizado()) {
            System.out.println("Ambiente administrativo organizado e limpo");
        } else {
            System.out.println("Setor administrativo necessita reorganização");
        }
        System.out.println();
    }

    @Override
    public void visitar(Frota frota) {

        System.out.println("AVALIAÇÃO DE LIMPEZA FROTA");

        if (frota.getQuantidadeVeiculos() > 10) {
            System.out.println("Necessária lavagem completa da frota");
        } else {
            System.out.println("Frota limpa e organizada");
        }
        System.out.println();
    }

    @Override
    public void visitar(Producao producao) {

        System.out.println("AVALIAÇÃO DE LIMPEZA PRODUÇÃO");

        if (producao.getQuantidadeFuncionarios() > 30) {
            System.out.println("Necessário reforço na higienização industrial");
        } else {
            System.out.println("Limpeza do setor de produção adequada");
        }
        System.out.println();
    }
}