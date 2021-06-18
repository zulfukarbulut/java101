package Homework;

import java.util.Scanner;

public class DikUcgen {
    public DikUcgen() {
    }

    public static void main (String[] args) {
        System.out.println("üçgenin kenar uzunluklarını giriniz");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int u = (a + b + c) / 2;
        double alan = Math.sqrt((double) (u * (u - a) * (u - b) * (u - c)));
        System.out.println("üçgenin alanı: " + alan);
    }
}
