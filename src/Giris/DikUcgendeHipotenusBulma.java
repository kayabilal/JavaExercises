package Giris;
import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int birinciKenar,ikinciKenar;
        System.out.println("birinci kenarı giriniz");
        birinciKenar=input.nextInt();
        System.out.println("ikinci kenarı giriniz");
        ikinciKenar=input.nextInt();
        double hipotenus=Math.sqrt(birinciKenar*birinciKenar + ikinciKenar*ikinciKenar);
        System.out.println("hipotenüs: " + hipotenus);
    }

}
