package Homework;

import java.util.Scanner;

public class Taksı {
    public Taksı () {
    }

    public static void main(String[] args) {
        double perKm = 2.2D;
        double startPrice = 10.0D;
        System.out.println("mesafeyi km cinsinden seçiniz");
        Scanner inp = new Scanner(System.in);
        int km = inp.nextInt();
        double total = (double)km * perKm;
        total += startPrice;
        if (total <= 20.0D) {
            total = 20.0D;
            System.out.println("toplam tutar" + total);
        } else {
            System.out.println("toplam tutar" + total);
        }
    }
}
