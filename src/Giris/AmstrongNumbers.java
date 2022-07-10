package Giris;
import java.util.Scanner;
/**
 * @author Bilal Kaya
 * @since 2022-07-10
 * AmstrongNumbers
 */
public class AmstrongNumbers {
    public static void main(String[] args) {
        // Diqit finding Process
        //2451/10=245
        //245/10=24
        //24/10=2
        //2/10=0
        //0/10=0

        //find the last digit of a number
        //2451%10=1
        //int b =2451;
        //int c=b%10;

        // Exponential process
        //int sub=2,sup=3;
        //int result=1;
        //for(int=1;i<=sup,i++){
        //result *=sub;}
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int number=input.nextInt();

        int basNumber=0;
        int tempNumber=number;
        int basValue;
        int result=0;
        int basPow;

        while(tempNumber!=0){
            tempNumber/=10;
            basNumber++;

        }
        tempNumber=number;
        while(tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int i=1;i<=basNumber;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;

        }

        if(result==number){
            System.out.println(number+"is a amstrong number");
        }else{
            System.out.println(number+"is not a amstrong number");
        }



    }
}
