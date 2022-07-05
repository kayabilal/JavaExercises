package Giris;

import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {
        int r;
        double a;
        double pi=3.14;
        Scanner input =new Scanner(System.in);
        System.out.println("yarıçap");
        r=input.nextInt();
        System.out.println("açı");
        a=input.nextDouble();
        double ddilimAlan=(pi*(r*r)*a)/360;
        System.out.println("daire dilimi alanı:"+ ddilimAlan);


    }


}
