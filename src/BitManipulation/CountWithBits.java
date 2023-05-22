package BitManipulation;

/**
 * Problem Statement
 * The world of bits is never ending. You are given a string consisting of only 0s and 1s.
 *
 * Let f(t) be the decimal representation of integer t written in binary form (possibly with leading zeroes). For example f(011)=3, f(00101)=5, f(00001)=1, f(10)=2, f(000)=0 and f(000100)=4.
 *
 * A substring is super awesome if number of characters in it is equal to its value.
 * In simple terms, the substring s(l), s(l+1), …, s(r) is good if r−l+1=f(s(l)…s(r)).
 *
 * where s(i) is the ith character of s.
 *
 * For example string s=1011 has 5 good substrings: s(1)…s(1)=1, s(3)…s(3)=1, s(4)…s(4)=1, s(1)…s(2)=10 and s(2)…s(4)=011.
 *
 * Your task is to calculate the number of good substrings of string s.
 * Input
 * The only line of input contains string s, consisting of only digits 0 and 1.
 *
 * Constraints
 * 1 ≤ |s| ≤ 100000
 * Output
 * Print one integer — the number of good substrings of string s.
 * Example
 * Sample Input 1
 * 0110
 *
 * Sample Output 1
 * 4
 *
 * Sample Input 2
 * 0101
 *
 * Sample Output 2
 * 3
 *
 * Sample Input 3
 * 00001000
 *
 * Sample Output 3
 * 4
 *
 * Sample Input 4
 * 0001000
 *
 * Sample Output 4
 * 3
 */


public class CountWithBits {


    public static void main(String[] args) {
        long[] P = new long[50];
        P[0]=1;
        for(int i=1;i<31;i++)
        {
            P[i]=P[i-1]*2;
        }
        int maxSum = 0;
        for(int i=0;i<31;i++)
        {
            maxSum+=P[i];
        }
        System.out.println(maxSum);
        System.out.println(Integer.MAX_VALUE);
    }
}
