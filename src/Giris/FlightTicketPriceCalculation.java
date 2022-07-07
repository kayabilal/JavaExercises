package Giris;
import java.util.Scanner;
/**
 * @author Bilal Kaya
 * FlightTicketPriceCalculation
 */
public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km, age, trip_type;
        double discounted_amount=0;
        double age_discount;
        double trip_type_discount;
        System.out.print("Enter the distance in km: ");
        km = sc.nextInt();
        System.out.print("Enter your Age: ");
        age = sc.nextInt();
        System.out.println("Enter your trip type '1'(one direction) or '2'(round trip) ");
        trip_type = sc.nextInt();

        if (age <= 0 || km <= 0) {
            System.out.println("you entered wrong data");
        }
        if (!((trip_type == 1) || (trip_type == 2))) {
            System.out.println("you entered wrong data");
        }
        double normal_amount = km * 0.10;

        if (trip_type == 1) {

            if (age < 12) {
                age_discount = normal_amount * 0.50;
                discounted_amount=normal_amount-age_discount;


            } else if (12<age && age< 24) {
                age_discount = normal_amount * 0.10;
                discounted_amount=normal_amount-age_discount;

            } else if (age > 65) {
                age_discount = normal_amount * 0.30;
                discounted_amount=normal_amount-age_discount;

            }
        }else{
            trip_type_discount=normal_amount*0.20;
             double discounted_amount_trip=normal_amount - trip_type_discount;
            if (age < 12) {
                age_discount = discounted_amount_trip * 0.50;
                discounted_amount=discounted_amount_trip-age_discount;
            } else if (12 < age && age< 24) {

                age_discount = discounted_amount_trip * 0.10;
                discounted_amount=discounted_amount_trip-age_discount;

            } else if (age > 65) {
                age_discount = discounted_amount_trip * 0.30;
                discounted_amount=discounted_amount_trip - age_discount;

            }
        }
        System.out.println("the amount you will pay or amount to be paid:" + discounted_amount);

        }
    }


