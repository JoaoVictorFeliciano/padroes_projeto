public class Main {

    public static void main(String[] args) {

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        PainelControle painel = new PainelControle();

        System.out.println();
        painel.executarComando(new AdicionarTarefaCommand(gerenciador, "Estudar Command"));
        painel.executarComando(new AdicionarTarefaCommand(gerenciador, "Implementar exercício"));
        painel.executarComando(new ConcluirTarefaCommand(gerenciador, "Estudar Command"));


        painel.desfazerUltimoComando();

        System.out.println();
        painel.adicionarNaFila(new AdicionarTarefaCommand(gerenciador, "Revisar Observer"));
        painel.adicionarNaFila(new AdicionarTarefaCommand(gerenciador, "Estudar Chain of Responsibility"));
        painel.adicionarNaFila(new ConcluirTarefaCommand(gerenciador, "Implementar exercício"));

        painel.processarFila();

        System.out.println();
        gerenciador.listarTarefas();
    }
}