package Giris;
import java.util.Scanner;
public class Donguler2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int k;
        System.out.print("Enter the number: ");
       k=sc.nextInt();
       for (int i=1;i<=k;i++){
           if(i%3==0 && i%4==0){
               System.out.println(i);
           }
        }
    }
}
