public class FilmePremiumProxy implements Conteudo{
    private FilmePremium filmePremium;


    @Override
    public void assistir(Usuario usario) {
       if(usario.getPlano().equals(Usuario.PLANO_PREMIUM)){
           System.out.println("Acesso liberado para: " + usario.getNome());

           if(filmePremium == null){
               filmePremium = new FilmePremium();
           }

           filmePremium.assistir(usario);
       } else if (usario.getPlano().equals(Usuario.PLANO_BASICO)) {
           System.out.println("Acesso negado para" + usario.getNome() + "Plano BASICO não permite acesso a conteudos premium.");
       }else{
           System.out.println("Plano Invalido para o usuario: " + usario.getNome());
       }


    }
}

