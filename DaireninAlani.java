package Homework;

import java.util.Scanner;


public class DaireninAlani {
    public DaireninAlani () {
    }

    public static void main(String[] args) {
        double pi = 3.14D;
        Scanner inp = new Scanner(System.in);
        System.out.println("yarıçap değerini giriniz");
        int yaricap = inp.nextInt();
        System.out.println("merkez açı değerini giriniz");
        int merkezAci = inp.nextInt();
        double alan =pi * (double)(yaricap * yaricap) * (double)merkezAci / 360.0D;
        System.out.println("daire diliminin alanı" + alan);
    }
}
