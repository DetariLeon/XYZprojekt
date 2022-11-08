package ddl;

import java.util.Scanner;

public class DDL {

    //terfogat szamitas
    public static double hengerTerfogat(double r, double m) {
        return (Math.pow(r, 2) * Math.PI * m);
    }

    //felszín számítás
    public static double hengerFelszin(double r, double m) {
        return (2 * Math.pow(r, 2) * Math.PI + 2 * r * Math.PI * m);
    }

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        double magassag, sugar;

        System.out.println("Adja meg a magassagat a hengernek! ");
        magassag = bill.nextDouble();
        System.out.println("Adja meg a sugarat a hengernek! ");
        sugar = bill.nextDouble();

        System.out.println("A henger terfogata: " + hengerTerfogat(sugar, magassag) + "cm^3");
        System.out.println("A henger felszine: " + hengerFelszin(sugar, magassag) + "cm^2");
    }

}
