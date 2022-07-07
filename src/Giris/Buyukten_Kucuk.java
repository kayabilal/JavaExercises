package Giris;
import java.util.Scanner;
public class Buyukten_Kucuk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=sc.nextInt();
        System.out.print("enter the second number:");
        int b=sc.nextInt();
        System.out.print("enter the third number:");
        int c=sc.nextInt();

        if ((a<b) && (a<c)){
            if (b<c) {
                System.out.println("c>b>a");
            }else{
                System.out.println("b>c>a");
            }
        }else if ((b<a)&&(b<c)){
            if(a>c){
                System.out.println("b<c<a");
            }else {
                System.out.println("b<a<c");
            }
        } else if ((c<a)&&(c<b)) {
            if (a>b){
                System.out.println("c<b<a");
            }else {
                System.out.println("c<a<b");
            }
        }

    }
}
