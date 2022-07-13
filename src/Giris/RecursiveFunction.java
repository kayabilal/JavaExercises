package Giris;

public class RecursiveFunction {

    static int f(int n){
        if(n==1){
            return 1;
        }
        int result=f(n-1) +n;
        System.out.println("result" + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(4));

    }
}
