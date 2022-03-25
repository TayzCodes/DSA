import java.util.*;
import java.io.*;
public class TestCounter {

     public static double get(double ed, double cnt){
        double d = cnt;
        if (d > ed) d = ed;
        cnt -= d;
        double res = cnt + d * (2 * ed - d + 1) / 2;
        return res;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n, p, k;
        n = sc.nextDouble();//counters
        p = sc.nextDouble();//people
        k = sc.nextDouble();//counter
        double l = 1, r = 1e9 + 10;

        while(l + 1 < r){
            double m = (l + r) / 2;
            double sum = get(m, k) + get(m, n - k + 1); // no of people
            if (  sum - m > p)
                r = m;
            else l = m; // maximum number of people at kth counter
        }

        System.out.println(Math.ceil(l));
    }
}
