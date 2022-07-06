package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String registered_userName="patika",registered_password="123456";
        Scanner sc=new Scanner(System.in);
        System.out.println("Kullanıcı adınız: ");
        String userName=sc.nextLine();
        System.out.println("şifre giriniz: ");
        String password=sc.nextLine();

        if(registered_userName.equals(userName) && registered_password.equals(password)){
            System.out.println("giriş başarı ile yapıldı");
        }
        else if(registered_userName.equals(userName) && !registered_password.equals(password)){
            System.out.println("the password is incorrect");
            System.out.println("you entered the wrong password.Dou you want to reset your password. 'yes' or 'no' ");
            String answer=sc.nextLine();
            if(answer.equals("yes")){
                System.out.println("you enter new password");
                String new_password=sc.nextLine();
                if(new_password.equals(registered_password)){
                    System.out.println("password has been created");

                }else{
                    System.out.println("Could not create password. please enter another password");

                }
            }
        }else if(!registered_userName.equals(userName) && registered_password.equals(password)){
            System.out.println("kullanıcı bilgisi hatalı");
        }else{
            System.out.println("kullanıcı adı ve şifre hatalı");
        }

    }
}
