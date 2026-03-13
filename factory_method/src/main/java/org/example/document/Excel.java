package org.example.document;

public class Excel implements InterfaceDocument{

    @Override
    public void gerar() {
        System.out.println("Gerando Planilha...");
    }
}
