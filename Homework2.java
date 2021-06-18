
import java.util.Scanner;

public class Homework2 {
    public Homework2() {
    }

    public static void main(String[] args) {
        double kdvOran = 0.18D;
        double kdvOran2 = 0.08D;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ücret Tutatırını Giriniz: ");
        double tutar = inp.nextDouble();
        double kdvTutar;
        if (tutar !=0.0D && !(tutar < 1000.0D)) {
            System.out.println("girilen tutar 1000 TL den büyük");
            kdvTutar = tutar * kdvOran2;
            System.out.println("KDV oranı %8 " + kdvTutar);
        } else {
            System.out.println("girilen tutar 0 ile 1000 TL arasında ");
            kdvTutar = tutar * kdvOran;
            System.out.println("KDV oranı %18 " + kdvTutar);
        }

        }
    }
