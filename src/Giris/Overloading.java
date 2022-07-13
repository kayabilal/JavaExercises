package Giris;

public class Overloading {
    static void print(){
        System.out.println("Parametresiz Metot");
    }
    static void print(int a ){
        System.out.println("parametreler" + a);
    }
    static void print(int a ,char b){
        System.out.println("patika");
    }
    static void print(char b,int a){
        System.out.println("patika");
    }
    static int print(int a,int b){
        return a+b;
    }
    static int print(int c,int d,int e){
        return c+d+e;
    }
    /*static int print(int a){
        return a; --hata verir.aynı parametreli olmucak. dönüş değeri değişse de
    }*/
    public static void main(String[] args) {
            print();
            print(4);
        System.out.println(print(5,4,6));
    }
}
