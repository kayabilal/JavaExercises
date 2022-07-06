package Giris;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç kilo domates?");
        int dk=input.nextInt();
        System.out.println("Kaç kilo elma?");
        int ek= input.nextInt();
        System.out.println("Kaç kilo armut?");
        int ak= input.nextInt();
        System.out.println("Kaç kilo muz?");
        int mk= input.nextInt();
        System.out.println("Kaç kilo patlican?");
        int pk= input.nextInt();

        double toplam=((armut*ak) +(domates*dk) +(muz*mk)+(patlican*pk) +(elma*ek));

        System.out.println("toplam tutar: " + toplam);
    }







}
