package com.company;

public class Main {

    public static void main(String[] args) {
        Student filip = new Student("Filip", "Krivashija", "INKI 681"); //vnesuvanje podatoci za studentot
        filip.SetOcenka(new Ocenka("Programiranje", "10.11.2020", 10)); //vnesuvanje predmet ocenka i datum
        filip.SetOcenka(new Ocenka("Matematika", "11.11.2020", 10));//vnesuvanje predmet ocenka i datum
        filip.SetOcenka(new Ocenka("Algoritmi", "20.11.2020", 9));//vnesuvanje predmet ocenka i datum
        System.out.println(filip.GetProsek()); //pecatenje na prosekot
        System.out.println(filip.toString()); // pecatenje na tostring metodata

    }
}