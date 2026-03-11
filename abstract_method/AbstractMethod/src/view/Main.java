package view;


import internacional.FornecedorInternacionalFactory;
import model.FornecedorFactory;
import nacional.FornecedorNacionalFactory;
import service.CheckoutService;

public class Main{
    public static void main(String args[ ]){

        FornecedorFactory nacional = new FornecedorNacionalFactory();
        CheckoutService checkoutNacional = new CheckoutService(nacional);
        checkoutNacional.finalizarCompra("PED-10", 99.0, 2.0, "01310-100");

        System.out.println();


        FornecedorFactory internacional = new FornecedorInternacionalFactory();
        CheckoutService checkoutInternacional = new CheckoutService(internacional);
        checkoutInternacional.finalizarCompra("PED-12", 99.0, 3.0, "01310-100");







    }

}