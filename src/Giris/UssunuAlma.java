package Giris;
import java.util.Scanner;
public class UssunuAlma {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1;i<=n;i*=2){
            System.out.println(i);
        }
    }
}
