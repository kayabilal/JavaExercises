package Giris;
import  java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input =new Scanner(System.in);
        System.out.println("enter heat: ");
        heat=input.nextInt();

        if (heat<6){
            System.out.println("You can sport");
        } else if (heat>=6 && heat<=22){
            if (heat<=17) {
                System.out.println("You can travel.");
            }
            if (heat>=9){
                System.out.println("you can read a book.");
            }
        }else{
            System.out.println("you can study.");
        }


    }
}
