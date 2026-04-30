public class LogMidleware extends Middleware{
    @Override
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");

        if(proximo != null){
            return proximo.processar(req);
        }
        return true;
    }


}
