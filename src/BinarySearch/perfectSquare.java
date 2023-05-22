package BinarySearch;
import java.util.*;

public class perfectSquare {
    public static boolean prfctsqr(int n){
        if(n<2) return true;
        long st=2;
        long ed=n/2;

        while(st<=ed){
            long mid=st+(ed-st)/2;
            if(mid*mid==n){
                return true;
            }else if(mid*mid>n){
                ed=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        long Q=scan.nextLong();
        for(int i=0; i<=Q; i++){
            int N=scan.nextInt();
            if(prfctsqr(N)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
