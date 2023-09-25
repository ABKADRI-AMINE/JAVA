package com.ex4;

public class Main {
    public static void main(String[] args) {
        sexagesiamuxdecimux durr = new sexagesiamuxdecimux(5, 33, 30);
        durr.getDec();


        sexagesiamuxdecimux segi = new sexagesiamuxdecimux(19.141);
        int c = segi.getHeures();
        System.out.println("Votre durre en heure est " + c + " heures");

        int d = segi.getMinutes();
        System.out.println("Votre durre en minutes est " + d + " minutes");

        int e = segi.getSecondes();
        System.out.println("Votre durre en minutes est " + e + " secondes");
    }
}