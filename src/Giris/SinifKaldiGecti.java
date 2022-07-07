package Giris;
import java.util.Scanner;
public class SinifKaldiGecti {
    public static void main(String[] args) {
        /*double math,physics,turkish,chemistry,music;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your math grade :");
        math=sc.nextInt();
        System.out.print("enter your physics grade :");
        physics=sc.nextInt();
        System.out.print("enter your turkish grade: ");
        turkish=sc.nextInt();
        System.out.println("enter your kimya grade : ");
        chemistry=sc.nextInt();
        System.out.println("enter your music grade : ");
        music=sc.nextInt();



        if(math<=0 || math>=100){
            math=0;
        }
        if(physics<=0 || physics>=100){
            physics=0;
        }
        if(chemistry<=0 || chemistry>=100){
            chemistry=0;
        }
        if(turkish<=0 || turkish>=100){
            turkish=0;
        }
        if(music<=0 || music>=100){
            music=0;
        }
        double average= (math + physics + turkish + chemistry + music)/5;

        if (average>=55){
            System.out.println("You passed the class. Congratulations");
        }else{
            System.out.println("you failed the class. See you next year again");
        }
        System.out.println("Your Average: " + average);

*/
        double math,physics,chemistry,turkish,music,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your math grade");
        math=sc.nextDouble();
        if (!(math<=0 || math>=100)){
            total+=math;
        }
        System.out.println("enter your math grade");
        physics=sc.nextDouble();
        if (!(physics<=0 || physics>=100)){
            total+=physics;
        }
        System.out.println("enter your math grade");
        chemistry=sc.nextDouble();
        if (!(chemistry<=0 || chemistry>=100)){
            total+=chemistry;
        }
        System.out.println("enter your math grade");
        music=sc.nextDouble();
        if (!(music<=0 || music>=100)){
            total+=music;
        }
        System.out.println("enter your math grade");
        turkish=sc.nextDouble();
        if (!(turkish<=0 || turkish>=100)){
            total+=turkish;
        }
        double average=total/5;

        if (average>=55){
            System.out.println("you passed the class. Congratulations");
        }else{
            System.out.println("you failed the class.See you next year again.");
        }
        System.out.println("Your Average: " + average);




    }
}
