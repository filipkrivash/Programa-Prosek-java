package com.company;

public class Ocenka {
    String predmet;
    String datum;
    int ocenka;

    //constructor
    public Ocenka(String predmet, String datum, int ocenka) {
        this.ocenka = ocenka;
        this.datum = datum;
        this.predmet = predmet;
    } // geteri i seteri

    public String getPredmet() {
        return predmet;
    }

    public String getDatum() {
        return datum;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    // to string metoda
    @Override
    public String toString() {
        return "Predmet : " + predmet + " " + "Datum : " + datum + " " + "Ocenka : " + ocenka + '\'' + ".";
    }
}
