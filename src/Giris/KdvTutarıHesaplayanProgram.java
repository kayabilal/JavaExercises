package Giris;
import java.util.Scanner;


public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        double tutar;
        Scanner input =new Scanner (System.in);
        System.out.println("Ücret Tutarı: ");
        tutar=input.nextDouble();
        double kdvYeniOran=tutar>1000 ? 0.08:0.18;
        double kdvtutar=tutar*kdvYeniOran;
        double toplam=kdvtutar +tutar;
        System.out.println(toplam);





    }



}
