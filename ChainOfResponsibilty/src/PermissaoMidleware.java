public class PermissaoMidleware extends Middleware{
    @Override
    public boolean processar(Requisicao req) {
        if(!"ADMIN".equals(req.getPermissao())){
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
        if(proximo != null){
            return proximo.processar(req);
        }
        return true;
    }
}
