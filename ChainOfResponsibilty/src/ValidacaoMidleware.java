public class ValidacaoMidleware extends Middleware{
    @Override
    public boolean processar(Requisicao req) {
        if(!req.isDadosValidos()){
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
        if(proximo != null){
            return proximo.processar(req);
        }

        return true;
    }
}
