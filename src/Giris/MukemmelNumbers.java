package Giris;
import java.util.Scanner;
public class MukemmelNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter a Number");
            int number=sc.nextInt();
            if(number==10){
                break;
            }
            int total=0;
            for(int i=1;i>number;i++){
                if(number%i==0){
                    total+=i;
                }

            }
            if(total==number){
                System.out.println("Mükemmel sayıdır");

            }else{
                System.out.println("Mükemmel sayi değildir.");
            }

        }

    }
}
