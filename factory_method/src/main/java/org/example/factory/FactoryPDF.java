package org.example.factory;

import org.example.document.InterfaceDocument;
import org.example.document.PDF;


public class FactoryPDF extends FactoryDocument{

    @Override
    public InterfaceDocument createDocument() {
         return new PDF();
    }
}
