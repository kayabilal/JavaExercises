package Giris;
import java.util.Scanner;
public class Calculator {
    //Scanner scan=new Scanner(System.in); --neden burda olunca hata veriyo.
    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number,result=0,i=1;
        while(true){
            System.out.println(i++ + ". sayi: ");
            number=scan.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sonuç: "+ result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz");
        int counter=scan.nextInt();
        int number,result=0;

        for(int i=1;i<=counter;i++){
            System.out.println(i+".sayı :");
            number=scan.nextInt();
            if(i==1){
                result +=number;
                continue;
            }
            result -=number;
        }
        System.out.println("Sonuç:" +result);
    }


    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
    static void mode () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Modu alınacak Sayıyı giriniz :");
            int moduAlinan = sc.nextInt();
            System.out.print("Mod sayısını giriniz :");
            int modSayisi = sc.nextInt();
            int sonuc = moduAlinan%modSayisi;
            System.out.println("Sonuç : " + sonuc);
        }
    static void calc () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Birinci kenar uzunluğunun giriniz :");
            int kenar1 = sc.nextInt();
            System.out.print("İkinci kenar uzunluğunun giriniz :");
            int kenar2 = sc.nextInt();
            int alan, cevre;
            cevre=2*(kenar1+kenar2);
            alan=kenar1*kenar2;
            System.out.println("Dikdörtgenin çevresi: " + cevre);
            System.out.println("Dikdörtgenin alanı: " + alan);
        }

        System.out.println("Sonuç : " + result);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Addition\n"
                + "2-Subtraction\n"
                + "3-multiplication\n"
                + "4-Division\n"
                + "5-Calculating exponents\n"
                + "6-factorial calculation"
                + "7-Mode calculating"
                + "8-perimeter and area calculation of rectangle"
                + "0-Exit";

        do {
            System.out.println(menu);
            System.out.println("Please select a process");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered a incorrect value,try again");

            }
        } while (select != 0);
    }
}
