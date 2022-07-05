package Giris;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fzk,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("matematik notunuz: ");
        mat=inp.nextInt();
        System.out.println("fizik notunuz: ");
        fzk=inp.nextInt();
        System.out.println("kimya notunuz: ");
        kimya=inp.nextInt();
        System.out.println("turkce notunuz: ");
        turkce=inp.nextInt();
        System.out.println("tarih notunuz: ");
        tarih=inp.nextInt();
        System.out.println("muzik notunuz: ");
        muzik=inp.nextInt();

        float sonuc=(mat +fzk+kimya+tarih+turkce+muzik)/6;
        System.out.println(" Notunuz :" + sonuc);
        String result= sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
