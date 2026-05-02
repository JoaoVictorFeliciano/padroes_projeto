import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<String> tarefas = new ArrayList<>();
    private List<Boolean> concluidas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(descricao);
        concluidas.add(false);
        System.out.println("Tarefa adicionada: " + descricao);
    }

    public String removerUltimaTarefa() {
        if (tarefas.isEmpty()) {
            return null;
        }

        int ultimo = tarefas.size() - 1;
        String removida = tarefas.remove(ultimo);
        concluidas.remove(ultimo);

        System.out.println("Tarefa removida: " + removida);
        return removida;
    }

    public void concluirTarefa(String descricao) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).equals(descricao)) {
                concluidas.set(i, true);
                System.out.println("Tarefa concluída: " + descricao);
                return;
            }
        }
    }

    public void listarTarefas() {
        System.out.println("\nLISTA DE TAREFAS: ");

        for (int i = 0; i < tarefas.size(); i++) {
            String status = concluidas.get(i) ? "Concluída" : "Pendente";
            System.out.println(status + " " + tarefas.get(i));
        }
    }

    public void desfazerConclusao(String descricao) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).equals(descricao)) {
                concluidas.set(i, false);
                System.out.println("Tarefa voltou para pendente: " + descricao);
                return;
            }
        }
    }
}