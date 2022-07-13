package Giris;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberAmount;
        int number=0;
        int temp=0;
        System.out.println("how many numbers will you enter");
        numberAmount=sc.nextInt();
        while(numberAmount>0){
            System.out.println("enter the number");
            number=sc.nextInt();
            if(number>temp){
                temp=number;

            }
            numberAmount--;



        }
        System.out.println("max value:"+temp);

    }
}
