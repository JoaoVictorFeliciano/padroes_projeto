public class TipoBloco implements Bloco{

    private final String nome;
    private final String textura;
    private final boolean solido;

    public TipoBloco(String nome, String textura, boolean solido) {
        this.nome = nome;
        this.textura = textura;
        this.solido = solido;
    }

    @Override
    public void exibir(int x, int y, int z) {
        System.out.println("Bloco " + nome +
                " | textura: " + textura +
                " | sólido: " + solido +
                " | posição: (" + x + ", " + y + ", " + z + ")");

    }
}
