package Mocks;

public class PrintRecursively {
    static int f(int n){
        if(n==1){
            System.out.println(n);
            return n;
        }else {
            int x = f(n-1)+1;
            System.out.println(x);
            return x;
        }
    }
    public static void main(String[] args) {
            f(10);
    }
}
