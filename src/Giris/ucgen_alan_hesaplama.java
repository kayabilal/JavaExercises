package Giris;
import java.util.Scanner;
public class ucgen_alan_hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.print("birincikenar");
        a=input.nextInt();
        System.out.print("ikincikenar");
        b=input.nextInt();
        System.out.print("ucuncukenar");
        c=input.nextInt();
        int u=(a+b+c)/2;
        int cevre=2*u;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ücgen alanı: " + alan);

    }
}
