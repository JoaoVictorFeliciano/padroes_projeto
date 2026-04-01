public class Usuario {
    private String nome;
    private String plano;

    public static final String PLANO_BASICO = "Básico";
    public static final String PLANO_PREMIUM = "Premium";

    public Usuario(String nome, String plano) {
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public String getPlano() {
        return plano;
    }

}
