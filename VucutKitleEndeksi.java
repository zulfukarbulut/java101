package Homework;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public VucutKitleEndeksi () {
    }

    public static void main(String[] args) {
        System.out.println("Lütfen boyunuzu giriniz");
        Scanner inp = new Scanner(System.in);
        double boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = inp.nextDouble();
        double sonuc = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz hesaplandı :" + sonuc);
    }
}
