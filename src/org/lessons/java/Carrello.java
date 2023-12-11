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

        //Input inizio Carrello



        boolean sentinella = false;

        while (!sentinella){
            System.out.println("Vuoi inserire un prodotto al carrello (y/n) : ");
            String choiceAdd = myBroScan.nextLine();

            System.out.println("Hai la carta fedeltà del nostro shop (y/n) : ");
            String choiceCard = myBroScan.nextLine();
            switch (choiceAdd){
                case "y":
                    //Input Prodotto
                    System.out.println("Inserisci il nome del prodotto : ");
                    String nameProduct = myBroScan.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto : ");
                    String descriptionProduct = myBroScan.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto : ");
                    String tempPrice = myBroScan.nextLine();
                    BigDecimal priceProduct = new BigDecimal(tempPrice);

                    System.out.println("Inserisci l'Iva del prodotto(percento) ");
                    String tempPrice2 = myBroScan.nextLine();
                    BigDecimal ivaProduct = new BigDecimal(tempPrice2);

                    //Input Extra
                    System.out.println("Che tipo di prodotto vuoi inserire nel tuo carrello (Smartphone/Cuffia/Televisore/Altro) : ");
                    String choiceType = myBroScan.nextLine();


                    switch (choiceType){
                        case "smartphone":
                            System.out.println("Di quanta memoria hai bisogno : ");
                            int userMemory = Integer.parseInt(myBroScan.nextLine());
                            myShop.add(new Smartphone(nameProduct,descriptionProduct,priceProduct,ivaProduct,userMemory));
                            break;

                        case "cuffia":
                            System.out.println("Di che colore vuoi le cuffie : ");
                            String colorPods = myBroScan.nextLine();
                            System.out.println("Di che tipo supportano (Wirless/Cable) : ");
                            String typePods = myBroScan.nextLine();
                            myShop.add(new Cuffia(nameProduct,descriptionProduct,priceProduct,ivaProduct,colorPods,typePods));
                            break;

                        case "televisore":
                            System.out.println("Di quanti pollici vuoi il tuo TV : ");
                            int polliciTv =  Integer.parseInt(myBroScan.nextLine());
                            System.out.println("Che tipo vuoi (Smart/no) : ");
                            String typeTv = myBroScan.nextLine();
                            myShop.add(new Televisore(nameProduct,descriptionProduct,priceProduct,ivaProduct,typeTv,polliciTv));
                            break;

                        default:
                            myShop.add(new Prodotto(nameProduct,descriptionProduct,priceProduct,ivaProduct));
                            break;
                    }

                    //Stampa Carrello
                    for (Prodotto element : myShop){
                        String printElement = element.toString();
                        System.out.println(printElement);
                    }
                    break;

                case "n":
                    System.out.println("Arrivederci");
                    sentinella = true;
                    break;
            }

        }

        //Chiudo Scan
        myBroScan.close();

    }
}
