package Giris;

public class Methods {

    static void helloWolrd(){
        System.out.println("Merhaba Dünya");
    }

    static int power(int base,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {

        //int case1=power(2,3);
        //System.out.println(case1);
        System.out.println(power(2,3));
        helloWolrd();
        //System.out.println(helloWorld());  --hata verir.herhangi birşey dönmüyor.
    }
}
