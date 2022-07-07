package Giris;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the year");
        year=sc.nextInt();
        boolean leap_year=false;

        if (year%4==0){
            if(year%100==0){
                if (year%400==0){
                    leap_year=true;
                }
                else{
                    leap_year=false;
                }

            }
            else{
                leap_year=true;

            }
        }
        else{
            leap_year=false;
        }

        if (leap_year){
            System.out.println(year + " is leap year.");
        }
        else{
            System.out.println(year + " is not leap year");
        }
    }
}
