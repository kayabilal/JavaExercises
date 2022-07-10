package Giris;
import java.util.Scanner;
public class TotalOfTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int total = 0;
        int x;

        while (n != 0) {
            x = n % 10;
            total += x;
            n /= 10;
        }
        System.out.println("total of the numbers " + total);
    }
}
