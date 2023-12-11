package org.lessons.java;

import java.math.BigDecimal;

public class Cuffia extends Prodotto{
    private String colore;
    private String supportType;

    //Costruttori
    public Cuffia(){

    }

    public Cuffia(String nome, String descrizine, BigDecimal prezzo, BigDecimal iva, String colore, String supportType) {
        super(nome, descrizine, prezzo, iva);
        this.colore = colore;
        this.supportType = supportType;
    }

    //Stampa


    @Override
    public String toString() {
        return "Cuffia{" +
                "colore='" + colore + '\'' +
                ", supportType='" + supportType + '\'' +
                '}';
    }

    //Getter and Setter
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }
}
