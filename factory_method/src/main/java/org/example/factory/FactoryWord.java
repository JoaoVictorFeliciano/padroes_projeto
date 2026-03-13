package org.example.factory;

import org.example.document.InterfaceDocument;
import org.example.document.Word;

public class FactoryWord extends FactoryDocument{

    @Override
    public InterfaceDocument createDocument() {
         return new Word();
    }
}
