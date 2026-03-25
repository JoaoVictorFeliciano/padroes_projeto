

public class Main{
    public static void main(String[] args){

        ControleUniversal samsunng = new SamsungAdapter(new TvSamsungApi());
        MiRemoteApp app1 = new MiRemoteApp(samsunng);
        app1.Assitir();
        app1.Desligar();

        System.out.println();

        ControleUniversal lg = new LgAdapter( new TvLgApi());
        MiRemoteApp app2 = new MiRemoteApp(lg);
        app2.Assitir();
        app2.Desligar();

        System.out.println();




    }

}