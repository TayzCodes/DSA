import java.util.*;
import java.io.*;

public class WC1 {
    public static void timesPositive(ArrayList<Integer> arr){
        for(int i=0;i< arr.size();i++){
            int a = arr.get(i);
            int cnt = 0;
            for(int j=0;j<= a; j++ ){
                int val = a-j;
                int xor = a^j;
                if(val == xor){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

        public static void main (String[] args) {

            // Your code here
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> input = new ArrayList<Integer>();
            Long T = sc.nextLong();
            System.out.println("T"+T);
            for (int i = 0; i < T; i++) {
                Long a = sc.nextLong();
                int cnt = 0;
                while (a != 0) {
                    if ((a & 1) > 0) cnt++;
                    a /= 2;
                }
                long ans = 1;
                long p = 2;
                while (cnt-- != 0) {
                    ans = ans * p;
                }
                System.out.println(ans);
            }
        }
}
