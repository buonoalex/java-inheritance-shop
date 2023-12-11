package org.lessons.java;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private String support;
    private int pollici;

    //Costruttori
    public Televisore(){

    }

    public Televisore(String nome, String descrizine, BigDecimal prezzo, String support, int pollici) {
        super(nome, descrizine, prezzo);
        this.support = support;
        this.pollici = pollici;
    }

    //Stampa

    @Override
    public String toString() {
        return "Televisore{" +
                "support='" + support + '\'' +
                ", pollici=" + pollici +
                '}';
    }


    //Getter and Setter

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }
}
