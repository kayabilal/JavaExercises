package Giris;
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        System.out.println("yarıçapı: ");
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        double pi = 3.14;
        double daireCevre=2*pi*r;
        double daireAlan=pi*r*r;
        System.out.println("alan ve çevresi: " + daireAlan + " " + daireCevre );


    }
}
