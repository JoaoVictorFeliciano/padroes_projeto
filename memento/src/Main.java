public class Main {

    public static void main(String[] args) {

        HistoricoDocumento historico = new HistoricoDocumento();

        Documento documento = new Documento(
                "Projeto Padrão Memento",
                "Conteúdo do documento.",
                "João Victor",
                "Versão 1"
        );

        System.out.println("ESTADO INICIAL");
        documento.exibirDocumento();

        historico.salvarVersao(documento.salvarEstado());
        System.out.println("Primeira versão salva.\n");

        documento.alterarConteudo("Conteúdo alterado pela primeira vez.");
        documento.alterarVersao("Versão 2");

        historico.salvarVersao(documento.salvarEstado());
        System.out.println("Segunda versão salva.\n");

        documento.alterarConteudo("Conteúdo alterado pela segunda vez.");
        documento.alterarVersao("Versão 3");

        System.out.println("ESTADO ATUAL");
        documento.exibirDocumento();

        MementoDocumento versaoAnterior = historico.obterUltimaVersao();

        if (versaoAnterior != null) {
            documento.restaurarEstado(versaoAnterior);
        }

        System.out.println("DOCUMENTO RESTAURADO PARA VERSÃO ANTERIOR");
        documento.exibirDocumento();

        MementoDocumento versaoMaisAntiga = historico.obterUltimaVersao();

        if (versaoMaisAntiga != null) {
            documento.restaurarEstado(versaoMaisAntiga);
        }

        System.out.println("DOCUMENTO RESTAURADO PARA VERSÃO MAIS ANTIGA");
        documento.exibirDocumento();
    }
}