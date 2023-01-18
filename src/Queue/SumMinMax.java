package Queue;
import java.util.*;
/**
 * Java issue with negative number mod
 * https://stackoverflow.com/questions/30652532/mod-operator-in-java-for-negative-number-is-not-working
 * using positive mod
 * (value%mod +mod)%mod
 */

/**
 * Problem Description
 * Given an array A of both positive and negative integers.
 *
 * Your task is to compute the sum of minimum and maximum elements of all sub-array of size B.
 *
 * NOTE: Since the answer can be very large, you are required to return the sum modulo 109 + 7.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of array A <= 105
 *
 * -109 <= A[i] <= 109
 *
 * 1 <= B <= size of array
 *
 *
 *
 * Input Format
 * The first argument denotes the integer array A.
 * The second argument denotes the value B
 *
 *
 *
 * Output Format
 * Return an integer that denotes the required value.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 5, -1, 7, -3, -1, -2]
 *  B = 4
 * Input 2:
 *
 *  A = [2, -1, 3]
 *  B = 2
 *
 *
 * Example Output
 * Output 1:
 *
 *  18
 * Output 2:
 *
 *  3
 */
public class SumMinMax {
    public int solve(int[] A, int B) {
        Deque<Integer> maxQ = new LinkedList<Integer>();
        Deque<Integer> minQ = new LinkedList<Integer>();
        int sum = 0;
        //System.out.print(B +"Value of B");
        int mod10 = 1000000007;
        int i=0;
        for(i = 0;i< B;i++) {
            while(!maxQ.isEmpty() && A[maxQ.peekLast()] <= A[i]){
                maxQ.removeLast();
            }
            while(!minQ.isEmpty() && A[minQ.peekLast()] >= A[i]){
                minQ.removeLast();
            }
            maxQ.addLast(i);
            minQ.addLast(i);
        }
        for(; i< A.length;i++){
            sum = (sum + A[minQ.peekFirst()]%mod10 + A[maxQ.peekFirst()]%mod10)%mod10;

            while(!maxQ.isEmpty() && maxQ.peekFirst() <= i-B){
                maxQ.removeFirst();
            }

            while(!minQ.isEmpty() && minQ.peekFirst() <= i-B){
                minQ.removeFirst();
            }
            while(!maxQ.isEmpty() && A[maxQ.peekLast()] <= A[i]){
                maxQ.removeLast();
            }
            while(!minQ.isEmpty() && A[minQ.peekLast()] >= A[i]){
                minQ.removeLast();
            }
            maxQ.addLast(i);
            minQ.addLast(i);


        }

        sum = (sum + A[minQ.peekFirst()]%mod10 + A[maxQ.peekFirst()]%mod10)%mod10;

        //(a%b+b)%b
        return (sum%mod10 +mod10)% mod10;

    }

    public static void main(String[] args) {

    }

}
