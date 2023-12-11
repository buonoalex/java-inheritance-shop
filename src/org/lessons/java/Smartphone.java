package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    private int smartMemory;
    private long imei;

    //Costruttori
    public Smartphone(){

    }

    public Smartphone(String nome, String descrizine, BigDecimal prezzo, BigDecimal iva, int smartMemory) {
        super(nome, descrizine, prezzo, iva);
        this.imei = setImei();
        this.smartMemory = smartMemory;
    }

    //Stampa
    @Override
    public String toString() {
        return "Smartphone{" +
                "smartMemory=" + smartMemory +
                ", imei=" + imei +
                '}';
    }

    //Getter and Setter
    public int getSmartMemory() {
        return smartMemory;
    }

    public void setSmartMemory(int smartMemory) {
        this.smartMemory = smartMemory;
    }

    public long getImei() {
        return imei;
    }

    public long setImei() {
        Random number = new Random();
        long numberRandom = number.nextLong(1,1000000000);
        return numberRandom;
    }
}
