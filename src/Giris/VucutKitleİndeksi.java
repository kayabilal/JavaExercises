package Giris;
import java.util.Scanner;
public class VucutKitleİndeksi {
    public static void main(String[] args) {
        int kilo;
        double boy;
        double vucutKitleİndeksi;
        System.out.println("Kilo: ");
        Scanner input =new Scanner(System.in);
        kilo=input.nextInt();
        System.out.println("Boy: ");
        boy=input.nextDouble();
        vucutKitleİndeksi=(kilo/(boy*boy));
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleİndeksi);






    }
}
