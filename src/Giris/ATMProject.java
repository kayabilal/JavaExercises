package Giris;
import java.util.Scanner;
public class ATMProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;
        while (right > 0) {
            System.out.print("Enter your name");
            userName = sc.nextLine();
            System.out.print("Enter your password");
            password = sc.nextLine();
            if (userName.equals("patika") && (password.equals("dev123"))) {
                System.out.println("You have logged into the system.");
                System.out.println("1-Money deposit\n" + "2-Withdraw Money\n" + "3-Balance inquiry\n" + "4-Exit");
                System.out.println("please select the action you want to do :");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Money amount:");
                        int price = sc.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.println("Money amount:");
                        price = sc.nextInt();
                        if (price > balance) {
                            System.out.println("insufficient balance");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("your balance :" + balance);
                        break;
                    case 4:
                        System.out.println("see you again");
                }
            } else {
                right--;
                System.out.println("Wrong Username and Password.Try again.");
            }
            if (right == 0) {
                System.out.println("Your account has been blocked.Please contact the bank ");
            } else {
                System.out.println("Kalan Hakkınız:" + right);
            }

        }
    }
}
