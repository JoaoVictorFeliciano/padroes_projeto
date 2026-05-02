public class RemoverUltimaTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private String tarefaRemovida;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas gerenciadorTarefas) {
        this.gerenciadorTarefas = gerenciadorTarefas;
    }

    @Override
    public void execute() {
        tarefaRemovida = gerenciadorTarefas.removerUltimaTarefa();
    }

    @Override
    public void undo() {
        if (tarefaRemovida != null) {
            gerenciadorTarefas.adicionarTarefa(tarefaRemovida);
        }
    }
}
