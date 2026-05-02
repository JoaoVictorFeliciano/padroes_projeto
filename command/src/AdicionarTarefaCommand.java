public class AdicionarTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private String descricao;

    public AdicionarTarefaCommand(GerenciadorTarefas gerenciadorTarefas, String descricao) {
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.descricao = descricao;
    }

    @Override
    public void execute() {
        gerenciadorTarefas.adicionarTarefa(descricao);
    }

    @Override
    public void undo() {
        gerenciadorTarefas.removerUltimaTarefa();
    }
}