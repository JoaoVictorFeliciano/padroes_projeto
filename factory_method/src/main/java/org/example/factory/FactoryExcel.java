package org.example.factory;

import org.example.document.Excel;
import org.example.document.InterfaceDocument;

public class FactoryExcel extends FactoryDocument{

    @Override
    public InterfaceDocument createDocument() {
        return new Excel();
    }
}
