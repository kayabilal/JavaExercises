package Giris;
import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be factored in");
        int n=sc.nextInt();
        int toplam=1;
        if (n==0){
            System.out.println("0! factorial equals 1");
        }else{
            for(int i=1;i<=n;i++){
                toplam=toplam*i;

            }
            System.out.println("factorial of the number you entered:" + toplam);

        }

    }
}
