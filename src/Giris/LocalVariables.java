package Giris;
import java.util.Scanner;
public class LocalVariables {
    static void sum(int a,int b){
        //int a=20; --hatalı kullanım
        a=20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=5;
        int b=20;
        /*if(a<10){
            int b=20;
            // System.out.println(a);   --hata yok.
        }*/
        // System.out.println(b); --hatalı kullanım.
        System.out.println(a);
        sum(a,b);
    }
}
