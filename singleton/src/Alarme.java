public class Alarme {
    public void tocar(){
        ControleVolume.getInstance().setVolume(80);
        System.out.println("Alarme tocando no volume X");
    }
    public void para(){
        System.out.println("Alarme parado");
    }
}
