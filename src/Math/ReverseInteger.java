package Math;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int ans = 0;

        int curr = 0;
        int num = x;
        while(num != 0){
            int q = num/10;
            int r = num %10;
            if (ans != 0 &&  ans > Integer.MAX_VALUE / 10){
                return 0;
            } // `a * x` would overflow
            if (ans != 0 && ans < Integer.MIN_VALUE / 10) {
                return 0;
            }

            ans = ans*10+r;
            num  = q;
        }

        return ans;




    }
    public static void main(String[] args) {

        System.out.println(reverse(-123));
    }
}
