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
        boolean fedelta = false;

        while (!sentinella){

            System.out.println("Vuoi inserire un prodotto al carrello (y/n) : ");
            String choiceAdd = myBroScan.nextLine();

            switch (choiceAdd){
                case "y":

                    //Input Sconto
                    System.out.println("Hai la carta fedeltà del nostro shop (y/n) : ");
                    String choiceCard = myBroScan.nextLine();
                    if (choiceCard.equals("y")){
                        fedelta = true;
                    }

                    //Input Prodotto
                    System.out.println("Inserisci il nome del prodotto : ");
                    String nameProduct = myBroScan.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto : ");
                    String descriptionProduct = myBroScan.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto : ");
                    String tempPrice = myBroScan.nextLine();
                    BigDecimal priceProduct = new BigDecimal(tempPrice);

                    //Input Extra
                    System.out.println("Che tipo di prodotto vuoi inserire nel tuo carrello (Smartphone/Cuffia/Televisore/Altro) : ");
                    String choiceType = myBroScan.nextLine().toLowerCase();


                    switch (choiceType){
                        case "smartphone":
                            System.out.println("Di quanta memoria hai bisogno : ");
                            int userMemory = Integer.parseInt(myBroScan.nextLine());
                            myShop.add(new Smartphone(nameProduct,descriptionProduct,priceProduct,userMemory));
                            break;

                        case "cuffia":
                            System.out.println("Di che colore vuoi le cuffie : ");
                            String colorPods = myBroScan.nextLine();
                            System.out.println("Di che tipo supportano (Wirless/Cable) : ");
                            String typePods = myBroScan.nextLine();
                            myShop.add(new Cuffia(nameProduct,descriptionProduct,priceProduct,colorPods,typePods));
                            break;

                        case "televisore":
                            System.out.println("Di quanti pollici vuoi il tuo TV : ");
                            int polliciTv =  Integer.parseInt(myBroScan.nextLine());
                            System.out.println("Che tipo vuoi (Smart/no) : ");
                            String typeTv = myBroScan.nextLine();
                            myShop.add(new Televisore(nameProduct,descriptionProduct,priceProduct,typeTv,polliciTv));
                            break;

                        default:
                            myShop.add(new Prodotto(nameProduct,descriptionProduct,priceProduct));
                            break;
                    }
                    break;

                case "n":
                    System.out.println("Arrivederci\n");
                    sentinella = true;
                    break;
            }

        }

        //Stampa Carrello
        for (Prodotto element : myShop){
            String printElement = element.toStringExtra(fedelta);
            System.out.println(printElement);
        }

        //Chiudo Scan
        myBroScan.close();

    }
}
