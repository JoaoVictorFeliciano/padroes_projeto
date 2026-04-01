public class FilmePremium implements Conteudo{
    @Override
    public void assistir(Usuario usuario) {
        System.out.println("Reproduzindo filme Premium para" + usuario.getNome());
    }
}
