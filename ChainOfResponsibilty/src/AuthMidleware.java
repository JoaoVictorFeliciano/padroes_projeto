public class AuthMidleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if(!"valido".equals(req.getToken())){
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }
        if(proximo != null){
            return proximo.processar(req);
        }
        return true;
    }
}
