public class ConcluirTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private String descricao;

    public ConcluirTarefaCommand(GerenciadorTarefas gerenciadorTarefas, String descricao) {
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.descricao = descricao;
    }

    @Override
    public void execute() {
        gerenciadorTarefas.concluirTarefa(descricao);
    }

    @Override
    public void undo() {
        gerenciadorTarefas.desfazerConclusao(descricao);
    }
}