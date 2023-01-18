package Queue;
import java.util.*;


/**
 * Given an array of integers A. There is a sliding window of size B, moving from the very
 * left of the array to the very right. You can only see the B numbers in the window.
 * Each time the sliding window moves rightwards by one position.
 * You have to find the maximum for each window.
 *
 * Return an array C, where C[i] is the maximum value in the array from A[i] to A[i+B-1].
 *
 * Refer to the given example for clarity.
 *
 * NOTE: If B > length of the array, return 1 element with the max of the array.
 *
 *
 * Problem Constraints
 * 1 <= |A|, B <= 106
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 *
 * The second argument given is the integer B.
 *
 *
 *
 * Output Format
 * Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 3, -1, -3, 5, 3, 6, 7]
 *  B = 3
 * Input 2:
 *
 *  A = [1, 2, 3, 4, 2, 7, 1, 3, 6]
 *  B = 6
 *
 *
 * Example Output
 * Output 1:
 *
 *  [3, 3, 5, 5, 6, 7]
 * Output 2:
 *
 *  [7, 7, 7, 7]
 */
public class slidingWindowMaximum {

    public static int[] slidingMaximum(final int[] A, int B) {

        if(B> A.length){
            int max = Integer.MIN_VALUE;
            for(int i =0;i< A.length;i++){
                max = Math.max(max, A[i]);
            }
            int[] C = new int[]{max};
            return C;

        }
        int[] res = new int[A.length-B+1];
        int itr = 0;
        Deque<Integer> q = new LinkedList<Integer>();

        for(int i =0;i< A.length;i++){
            if(i-B>=0){
                if(!q.isEmpty() && q.peekFirst() == A[i-B]){
                    q.removeFirst();
                }
            }
            while(!q.isEmpty() && q.peekLast() < A[i]){
                q.removeLast();
            }
            q.addLast(A[i]);

            if(i >= B-1){
                res[itr] = q.peekFirst();
                itr++;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -1, -3, 5, 3, 6, 7};//  [3, 3, 5, 5, 6, 7]
        int B = 3;
        System.out.println( slidingMaximum(arr,B));
    }
}
