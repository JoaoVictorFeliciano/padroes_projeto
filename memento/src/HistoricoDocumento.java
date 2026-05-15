import java.util.ArrayList;
import java.util.List;

public class HistoricoDocumento {

    private List<MementoDocumento> historico = new ArrayList<>();

    public void salvarVersao(MementoDocumento memento) {
        historico.add(memento);
    }

    public MementoDocumento obterUltimaVersao() {

        if (historico.isEmpty()) {
            return null;
        }

        return historico.remove(historico.size() - 1);
    }
}
