package Giris;
import java.util.Scanner;
public class ExponentialWithRecursive {
    public static int us(int a,int n){
        int total=1;
        for (int i=0;i<n;i++){
            total=total*a;
        }
        return total;

    }
    public static void main(String[] args) {
        int n,a;
        Scanner inp=new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz=");
        a= inp.nextInt();
        System.out.print("Us Degerini Giriniz=");
        n=inp.nextInt();
        System.out.println(us(a,n));
        System.out.println("islem bitmistir...");
    }
}
