package Strings;

/**
 * AB strings
 * medium
 *
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * ========================================================================================
 * Problem Statement
 * A string is called AB string if it's of length at least 2 and
 * all it's characters are A except the last character which is B.
 *
 * You have an empty string s, you can do the following operation any number of times.
 *
 * Choose any position of s and insert any AB string in that position.
 *
 * You are given a string t of some length containing only A and B.
 * Find out if it is possible to convert s to t after some operations.
 *
 * ========================================================================================
 * Input
 * First line contains N denoting the length of t.
 * Next line contains t.
 * ========================================================================================
 * Constraints
 * 1 <= N <= 105
 * t contains only A and B.
 * ========================================================================================
 * Output
 * Output "YES" or "NO".
 *
 * ========================================================================================
 * Example
 * Input:
 * 5
 * AAABB
 *
 * Output:
 * YES
 *
 * Explanation :
 * "" => "AAB" => "AA "AB" B" => "AAABB"
 *
 *
 * Input:
 * 3
 * ABB
 *
 * Output:
 * NO
 */
public class ABStrings {
    public static void isABString(String t){
        int cnt = 0;
        int f = 0;
        int n = t.length();
        for(int i = n-1;i>=0;i--){
            if(t.charAt(i) == 'A'){
                if(cnt == 0){
                    if(f ==0){
                        f = -1; // last character is not 'B' hence not able to reach from "" to t using AB strings
                        break;
                    }
                }else{
                    cnt--;
                }
            }else{
                cnt++;
                f = 1; // last character is 'B'
            }

        }
        if(f == -1 || cnt != 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
    public static void main(String[] args) {
        String t = "AAABB";
        isABString(t);
    }
}
