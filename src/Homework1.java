

import java.util.Scanner;

public class Homework1 {
    public  Homework1() {
    }

    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz: ");
        int mat = inp.nextInt();
        System.out.println("Fizik Notunu Giriniz: ");
        int fizik = inp.nextInt();
        System.out.println("Kimya Notunu Giriniz: ");
        int kimya = inp.nextInt();
        System.out.println("Türkçe Notunu Giriniz: ");
        int turkce = inp.nextInt();
        System.out.println("Tarih Notunu Giriniz: ");
        int tarih = inp.nextInt();
        System.out.println("Müzik Notunu Giriniz: ");
        int muzik = inp.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = (double)toplam / 6.0;
        System.out.println("Notların Ortalaması: " + sonuc);
        if (sonuc >= 60.0) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }



}
