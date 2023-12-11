package org.lessons.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        //Apro Scan
        Scanner myBroScan = new Scanner(System.in);

        //Array di prodotto
        ArrayList<Prodotto> myShop = new ArrayList<>();

        //Input Prodotto
        System.out.println("Inserisci il nome del prodotto : ");
        String nameProduct = myBroScan.nextLine();
        System.out.println("Inserisci la descrizione del prodotto : ");
        String descriptionProduct = myBroScan.nextLine();
        System.out.println("Inserisci il prezzo del prodotto : ");
        BigDecimal priceProduct = myBroScan.nextBigDecimal();
        System.out.println("Inserisci l'Iva del prodotto(percento) ");
        BigDecimal ivaProduct = myBroScan.nextBigDecimal();

        //Input Extra
        System.out.println("Che tipo di prodotto vuoi inserire nel tuo carrello (Smartphone/Cuffia/Televisore/Altro) : ");
        String choiceType = myBroScan.nextLine().toLowerCase();

        switch (choiceType){
            case "smartphone":
                System.out.println("Di quanta memoria hai bisogno : ");
                int userMemory = Integer.parseInt(myBroScan.nextLine());
                myShop.add(new Smartphone(nameProduct,descriptionProduct,priceProduct,ivaProduct,userMemory));
                break;

                case "cuffia":
                    System.out.println("Di che colore vuoi le cuffie : ");
                    String colorPods = myBroScan.nextLine();
                    System.out.println("Di tipo supportano (Wirless/Cable) : ");
                    String typePods = myBroScan.nextLine();
                    myShop.add(new Cuffia());
                    break;


        }

        //Chiudo Scan
        myBroScan.close();

    }
}
