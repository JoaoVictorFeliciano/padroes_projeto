package org.example.view;


import org.example.document.InterfaceDocument;
import org.example.factory.FactoryDocument;
import org.example.factory.FactoryExcel;
import org.example.factory.FactoryPDF;
import org.example.factory.FactoryWord;

import java.util.Scanner;
public class MainMenu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("====DOCUMENT GENERATOR====");
        System.out.println("1- Generate Word Document: ");
        System.out.println("2- Generate PDF Document: ");
        System.out.println("3- Generate Excel Document;");
        option = sc.nextInt();
        sc.nextLine();

        FactoryDocument factory = null;

        if( option == 1){
            factory = new FactoryWord();
        }if(option == 2){
            factory = new FactoryPDF();
        }if(option == 3){
            factory = new FactoryExcel();
        }

        if(factory != null) {
            InterfaceDocument documento = factory.createDocument();
            documento.gerar();
        }
    }
}