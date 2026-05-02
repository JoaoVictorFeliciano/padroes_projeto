import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PainelControle {

    private Stack<Command> historico = new Stack<>();
    private Queue<Command> fila = new LinkedList<>();

    public void executarComando(Command command) {
        command.execute();
        historico.push(command);
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Command ultimo = historico.pop();
            System.out.println("Desfazendo último comando:");
            ultimo.undo();
        }
    }

    public void adicionarNaFila(Command command) {
        fila.add(command);
        System.out.println("Comando adicionado na fila");
    }

    public void processarFila() {
        System.out.println("Processando fila:");

        while (!fila.isEmpty()) {
            Command command = fila.poll();
            command.execute();
            historico.push(command);
        }
    }
}