package Giris;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("Enter the number:");
        n = reader.nextInt();
        System.out.print(n1+" "+n2);

        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
