package Giris;
import java.util.Scanner;
public class UssunuAlma {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1;i<=n;i*=4){
            System.out.println(i);
        }
        System.out.println("*****************************************");
        for (int i=1;i<=n;i*=5){
            System.out.println(i);
        }
    }
}
