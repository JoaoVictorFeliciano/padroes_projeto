public class Questao {

    private int id;
    private String enunciado;
    private int pontos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Questao(int id, String enunciado, int pontos) {
        this.id = id;
        this.enunciado = enunciado;
        this.pontos = pontos;

    }

    public Questao copiar(){
        return new Questao(this.id, this.enunciado, this.pontos);
    }

    @Override
    public String toString() {
        return ("ID:" + this.id + "\nEnunciado:" + this.enunciado + "\nPontos" + this.pontos);
    }
}

