import java.util.ArrayList;
import java.util.List;

public class Prova {

    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;

    public Prova(String titulo, String turma, String data, String versao, List<Questao> questoes) {
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = questoes;
    }

    public Prova copiar() {

        List<Questao> novasQuestoes = new ArrayList<>();

        for (Questao questao : this.questoes) {
            novasQuestoes.add(questao.copiar());
        }

        return new Prova(
                this.titulo,
                this.turma,
                this.data,
                this.versao,
                novasQuestoes
        );
    }

    public int totalPontos() {
        int totalPontos = 0;

        for (Questao questao : questoes) {
            totalPontos += questao.getPontos();
        }

        return totalPontos;
    }

    public void substituirQuestao(int id, Questao nova) {

        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId() == id) {
                questoes.set(i, nova);
                return;
            }
        }
    }

    public void printResumo() {

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Turma: " + this.turma);
        System.out.println("Data: " + this.data);
        System.out.println("Versão: " + this.versao);
        System.out.println("TotalPontos: " + this.totalPontos());

        for (Questao questao : questoes) {
            System.out.println("ID: " + questao.getId());
            System.out.println("Pontos: " + questao.getPontos());
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
}


