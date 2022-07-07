package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args ) {
        Scanner sc=new Scanner(System.in);
        boolean isPasswordSuccess=false;
        String password;
        String registered_password="1234";

        while(!isPasswordSuccess){
            System.out.println("Şifrenizi giriniz");
            password=sc.nextLine();
            if(registered_password.equals(password)){
                System.out.println("the password is correct");
                isPasswordSuccess=true;
            }else{
                System.out.println("the password is incorrect");
            }
            for (int i=1;i<10;i++){
                System.out.println();



            }


        }
    }
}
