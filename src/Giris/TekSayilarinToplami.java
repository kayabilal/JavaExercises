package Giris;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int toplam=0;

        while(true){
            System.out.print("Enter the Number");
            n=sc.nextInt();
            if (n<0){
                break;
            }
            if(n%2==0 && n%4==0){
                toplam+=n;
            }
        }
        System.out.println("tek sayılar toplamı" + toplam);

    }
}
