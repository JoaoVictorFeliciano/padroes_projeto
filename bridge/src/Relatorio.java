import java.util.ArrayList;
import java.util.List;


public  abstract class Relatorio {

    protected Exportador exportador;
    protected List<ItemRelatorio> itemRelatorioList;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itemRelatorioList = new ArrayList<>();
    }

    public  void adicionarItem(ItemRelatorio item){
        itemRelatorioList.add(item);
    }

    protected double calcularTotal(){
        double total = 0;
        for(int i = 0; i < itemRelatorioList.size(); i++){
            double somar = itemRelatorioList.get(i).valor;
            total += somar;

        }
        return total;
    }

    protected List<ItemRelatorio> filtrarDetalhados(boolean detalhado){

        if(detalhado == true){
            return itemRelatorioList;
        } else{
            ArrayList item = new ArrayList<>();
            for(int i = 0; i < itemRelatorioList.size(); i++){
                if(itemRelatorioList.get(i).valor >= 100){
                   item.add(itemRelatorioList.get(i));
                }
            }
            return item;
        }

    }

    public abstract void gerar(boolean detalhado);
}
