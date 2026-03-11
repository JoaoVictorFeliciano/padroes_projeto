package nacional;

import model.Frete;

public class FreteNacional implements Frete {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino) {
        return 15 + (pesoKg * 2);
    }
}
