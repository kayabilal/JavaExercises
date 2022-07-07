package Giris;

import java.util.Scanner;

public class donguler3 {
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
            if(n%2==1){
                toplam+=n;
            }
        }
        System.out.println("tek sayılar toplamı" + toplam);

    }
}
