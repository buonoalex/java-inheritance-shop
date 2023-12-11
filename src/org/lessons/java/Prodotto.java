package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizine;
    private BigDecimal prezzo;
    private BigDecimal iva;

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizine() {
        return descrizine;
    }

    public void setDescrizine(String descrizine) {
        this.descrizine = descrizine;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    private BigDecimal setIva() {
        return BigDecimal.valueOf(21);
    }

    public int getCodice() {
        return codice;
    }

    private int setCodice() {
        Random number = new Random();
        int numberRandom = number.nextInt(1,1000);
        return numberRandom;
    }

    //Costruttori
    public Prodotto(){

    }

    public Prodotto(String nome, String descrizine, BigDecimal prezzo) {
        this.codice = setCodice();
        this.nome = nome;
        this.descrizine = descrizine;
        this.prezzo = prezzo;
        this.iva = setIva();
    }

    //Stampa


    public String toStringExtra(boolean extra) {
        if (extra){

            return "Prodotto \n" +
                    "codice = " + codice + "\n"+
                    "nome = " + nome + "\n" +
                    "descrizine = " + descrizine + "\n" +
                    "prezzo = " + prezzo + "€" + "\n" +
                    "iva = " + PrezzoConIva() +"€"+ "\n"+
                    "PrezzoFedeltà = "+ DiscountPrice2() + "€" +"\n"+
                    "-----------";

        }else {

            return "Prodotto \n" +
                    "codice = " + codice + "\n"+
                    "nome = " + nome + "\n" +
                    "descrizine = " + descrizine + "\n" +
                    "prezzo = " + prezzo + "€" + "\n" +
                    "iva = " + PrezzoConIva() +"€"+ "\n"+
                    "-----------";
        }

    }

    public BigDecimal PrezzoConIva(){
        BigDecimal c = prezzo.multiply(iva);
        BigDecimal c1 = c.divide(BigDecimal.valueOf(100));
        BigDecimal c2 = prezzo.add(c1);
        return c2;
    }

    public BigDecimal DiscountPrice2 (){
        BigDecimal b = prezzo.multiply(BigDecimal.valueOf(2));
        BigDecimal b1 = b.divide(BigDecimal.valueOf(100));
        BigDecimal b2 = prezzo.subtract(b1);
        return b2;
    }
}
