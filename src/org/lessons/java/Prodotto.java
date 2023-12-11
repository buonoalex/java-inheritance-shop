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

    public void setIva(BigDecimal iva) {
        this.iva = iva;
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

    public Prodotto(String nome, String descrizine, BigDecimal prezzo, BigDecimal iva) {
        this.codice = setCodice();
        this.nome = nome;
        this.descrizine = descrizine;
        this.prezzo = prezzo;
        this.iva = iva;
    }

}
