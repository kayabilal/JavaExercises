package Giris;
import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int n =sc.nextInt();
        double result=0.0;
        for(int i=1;i<=n;i++){
            result+=(1.0/i);
        }
        System.out.println(result);
    }

}
