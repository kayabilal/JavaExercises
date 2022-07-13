package Giris;
import java.util.Scanner;
public class EBOB_EKOK {
    public static void main(String[] args) {
        //EKOK
        Scanner input=new Scanner(System.in);
        System.out.print("enter the n1 number");
        int n1=input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        int i=1;
        while (i <= (n1*n2)){
            if(i%n1==0&& i%n2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        int ebob=1;
        int a=1;
        while(a<n1){
            a++;
            if(n1%a==0 && n2%a==0){

                ebob=a;
            }
            System.out.println("ebob:" + a);


        }



    }
}
