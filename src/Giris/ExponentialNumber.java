package Giris;
import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be exponentiated");
        int n=sc.nextInt();
        System.out.println("Enter the number to be the exponent");
        int k=sc.nextInt();
        int toplam=1;
        for(int i=1;i<=k;i++){
            toplam*=n;
        }
        System.out.println("The exponentiated number equals"+toplam);
    }

}
