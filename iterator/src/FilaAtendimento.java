import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {

    private List<SenhaAtendimento> senhas;

    public FilaAtendimento() {
        senhas = new ArrayList<>();
    }

    public void adicionarSenha(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    protected List<SenhaAtendimento> getSenhas() {
        return senhas;
    }

    public IteratorSenha criarIterator() {
        return new FilaAtendimentoIterator(this);
    }
}
