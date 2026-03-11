package internacional;

import model.Frete;

public class FreteInternacional implements Frete {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino) {
        return 40 + (pesoKg * 5);
    }
}
