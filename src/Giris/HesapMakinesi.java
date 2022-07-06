package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.sayıyı girin");
        n1=sc.nextInt();
        System.out.println("2.sayıyı giriniz");
        n2=sc.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("Yapıcağınız işlemi seciniz.");
        select=sc.nextInt();

        switch (select){
            case 1:
                System.out.println("toplam: "+(n1+n2));
                break;

            case 2:
                System.out.println("çıkarma: "+(n1-n2));
                break;

            case 3:
                System.out.println("çarpma: " +(n1*n2));
                break;

            case 4:
                System.out.println("bölme: " + (n1/n2));
                break;
        }


    }
}
