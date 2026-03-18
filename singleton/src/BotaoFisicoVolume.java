public class BotaoFisicoVolume {

    public void pressionarMais(){
        ControleVolume.getInstance().aumentar(5);
    }

    public void pressionaMenos(){
        ControleVolume.getInstance().diminuir(5);
    }
}
