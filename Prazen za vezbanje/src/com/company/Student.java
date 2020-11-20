package com.company;

import java.util.Arrays;

public class Student extends Covek {
    String indeks;
    private Ocenka nizaocenki[];
    private double prosek;

    //constructor
    public Student(String ime, String prezime, String indeks) {
        super(ime, prezime);
        this.indeks = indeks;
        nizaocenki = new Ocenka[0];
    }

    //geteri i seteri
    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public void SetOcenka(Ocenka o) {
        nizaocenki = Arrays.copyOf(nizaocenki, nizaocenki.length + 1);
        nizaocenki[nizaocenki.length - 1] = o;
    }

    //GetProsek() metod :
    public double GetProsek() {
        double zbir = 0;
        if (nizaocenki.length > 0) {
            for (Ocenka o : nizaocenki) {
                zbir += o.getOcenka();
            }
            this.prosek = zbir / nizaocenki.length;
            return this.prosek;
        } else {
            return 0.0f;
        }
    }

    //toString metod
    @Override
    public String toString() {
        return "Studentot so ime " + ime + " " + "prezime " + prezime + " indeks br : " + indeks + " ima oceni : " + Arrays.toString(nizaocenki) + " i ima ostvareno prosek od : " + prosek + '\'' + ".";
    }
}
