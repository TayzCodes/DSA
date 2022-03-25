/**
 * Problem Statement
 * Walter white is considered very intelligent person. He has a problem to solve. As he is suffering from cancer,
 * can you help him solve it?
 * Given two integer arrays C and S of length c and s respectively. Index i of array S can be considered
 * good if a subarray of length c can be formed starting from index i which is complimentary to array C.
 * Two arrays A, B of same length are considered complimentary if any cyclic permutation of A satisfies the property
 * (A[i]- A[i-1]=B[i]-B[i-1]) for all i from 2 to length of A (1 indexing).
 * Calculate number of good positions in S .
 * READ: Cyclic Permutation
 * 1 2 3 4 has 4 cyclic permutations 2 3 4 1, 3 4 1 2, 4 1 2 3,1 2 3 4
 * Input
 * First line contains integer s (length of array S).
 * Second line contains s space separated integers of array S.
 * Third line contain integer c (length of array C).
 * Forth line contains c space separated integers of array C.
 *
 * Constraints:
 * 1 <= s <=1000000
 * 1 <= c <=1000000
 * 1 <= S[i], C[i] <= 10^9
 * Output
 * Print the answer.
 *
 * Example
 * Input :
 * 9
 * 1 2 3 1 2 4 1 2 3
 * 3
 * 1 2 3
 *
 * Output :
 * 4
 * Explanation :
 * index 1- 1 2 3 matches with 1 2 3
 * index 2- 2 3 1 matches with 2 3 1(2 3 1 is cyclic permutation of 1 2 3)
 * index 3- 3 1 2 matches with 3 1 2(3 1 2 is cyclic permutation of 1 2 3)
 * index 7- 1 2 3 matches with 1 2 3
 *
 * Input :
 * 4
 * 3 4 3 4
 * 2
 * 1 2
 *
 * Output :
 * 3
 */


package ArraySort;
import java.util.*;

public class PermutationPositions {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long[] S = new long[s];
        for(int i = 0;i<s;i++){
            S[i] = sc.nextLong();
        }
        int c = sc.nextInt();
        long[] C = new long[c];
        for(int i = 0;i<c;i++){
            C[i] = sc.nextLong();
        }
        /**
         * Given here is a brute force approach
         */
        int itr = c;
        int pos = 0;
        long[] perm = C;
        while(itr>0){
            System.out.println("For permutation: ");
            for(int i = 0;i<c;i++) {
                System.out.print(perm[i] + " ");
            }
            System.out.println();
            int x = 0;
            while(x+(c-1) < s){
                boolean compliment = true;
                for(int i = 1;i<c;i++) {

                    if (S[i + x] - S[i + x - 1] != perm[i] - perm[i - 1]) {
                        compliment = false;
                        break;
                    }


                }
                if(compliment)pos++;
                x++;
            }
            // next permutation

            long t = perm[0];
            for(int i=0;i<c-1;i++){
                perm[i] = perm[i+1];
            }
            perm[c-1] = t;
            itr--;
            System.out.println("matches found "+ pos);
        }
        System.out.println(pos);
    }
}
