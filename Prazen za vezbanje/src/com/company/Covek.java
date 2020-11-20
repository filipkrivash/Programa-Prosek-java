package com.company;

public class Covek {
    String ime;
    String prezime;

    //constructor
    Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    //geteri i seteri
    String getIme() {
        return ime;
    }

    String getPrezime() {
        return prezime;
    }

    void setIme(String ime) {
        this.ime = ime;
    }

    void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    //toString metod
    public String toString() {
        return "Covekot so ime " + ime + " " + " prezime " + prezime + " " + "ne e student " + '\'' + ".";
    }
}
