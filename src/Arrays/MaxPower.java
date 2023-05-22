package Arrays;
import java.util.*;

/**
 * Maximum Power
 * Problem Description
 * You are given an array A. For a subset S of A, power(S) = |S|*sum(S).
 *
 * Divide A into subsets such that each element of A belongs to exactly one subset and power(A) is maximum where power(A) = power(S_1) + power(S_2) + power(S_3) + ... + power(S_k) where S_1, S_2, S_3, ... , S_k are subsets A is divided into.
 *
 * Return the maximum possible value of power(A) if you divide A into subsets optimally.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 * -106 <= A[i] <= 106
 *
 *
 * Input Format
 * The first and only argument is an integer array A.
 *
 *
 * Output Format
 * Return an integer denoting the maximum possible value of power(A) if you divide A into subsets optimally.
 *
 *
 * Example Input
 * Input 1 :
 * A=[4, 0, -1]
 * Input 2 :
 * A=[3, -5]
 *
 *
 * Example Output
 * Output 1 :
 * 9
 * Output 2 :
 * -2
 *
 *
 * Example Explanation
 * Example 1 :
 *
 *
 * You can divide A into {4,0,-1}. Hence, power(A) = power({4,0,-1}) = 3*(4+0-1) = 9
 *
 * Example 2 :
 *
 *
 * You can divide A into {3} and {5}. Hence, power(A) = power({3}) + power({-5}) = 1*3 + 1*(-5) = -2.
 */
public class MaxPower {
    public static long solve(int[] A) {
        Arrays.sort(A);
        long possum = 0;
        int poscnt = 0;
        long negsum = 0;
        int negcnt = 0;
        int totalsum = 0;
        int mod = 1000000007;
        for(int i = 0;i< A.length ;i++){
            if(A[i]<0){
                negcnt++;
                negsum = (negsum+ A[i])%mod;
            }else{
                poscnt++;
                possum= (possum  + A[i])%mod;
            }
            totalsum = (totalsum+A[i])%mod;
        }
        long maxpower = Math.max((totalsum*(A.length))%mod, totalsum);
        int  i =0;
        long power = 0;
        while(negcnt !=0 ){
            power = ((poscnt*possum) %mod + (negcnt*negsum)%mod)%mod;
            maxpower = Math.max(power, maxpower);
            negcnt--;
            poscnt++;
            possum += A[i];
            negsum -=A[i];

        }

       return maxpower;
    }

    public static void main(String[] args) {
        int[]  a = new int[]{193707, 777197, 682471, 601751, -867656, -465082,
                -752707, 39002, 595853, -57349, -9630, 366489, -203890, 654072, -559693,
                -803163, 23109, -940552, 873421, 752726, -182512, -92422, 273889, 598617,
                608846, -995584, 459267, -65956, -441465, 513179, 681551, -520251, 239738,
                982376, -785615, 890430, -334302, -935849, -953188, -946637, 362196, 135424,
                -980696, 969538, 848081, -200557, 439660, -545759, -114758, 522223, -939098,
                106519, -535079, 601597, -81684, 969575, 39793, 159430,
                -511187, -275014, -515838, 419454, -541183, 595823,
                -36142, 997001, -392284, 943025, -954933 };

        System.out.println(solve(a));
    }
}



