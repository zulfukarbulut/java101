package Homework;

import java.util.Scanner;

public class ManavKasa {
    public ManavKasa() {
    }

    public static void main(String[] args) {
        double armut = 2.14D;
        double elma = 3.67D;
        double domates = 1.11D;
        double muz = 0.95D;
        double patlıcan = 5.0D;
        Scanner inp = new Scanner(System.in);
        System.out.println("Armut kaç kilo? ");
        double kilo = inp.nextDouble();
        double sonucArmut = kilo * armut;
        System.out.println(" ");
        System.out.println("elma kaç kilo? ");
        kilo = inp.nextDouble();
        double sonucElma = kilo * elma;
        System.out.println(" ");
        System.out.println("domates kaç kilo? ");
        kilo = inp.nextDouble();
        double sonucDomates = kilo * domates;
        System.out.println(" ");
        System.out.println("muz kaç kilo? ");
        kilo = inp.nextDouble();
        double sonucMuz = kilo * muz;
        System.out.println(" ");
        System.out.println("patlıcan kaç kilo? ");
        kilo = inp.nextDouble();
        double sonucPatlıcan = kilo * patlıcan;
        double toplam = sonucArmut + sonucElma + sonucDomates + sonucMuz + sonucPatlıcan;
        System.out.println("toplam tutar" + toplam);
    }
}
