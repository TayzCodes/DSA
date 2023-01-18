package Queue;
import java.util.*;

/**
 * Given a string A denoting a stream of lowercase alphabets, you have to make a new string B.
 * B is formed such that we have to find the first non-repeating character each time a character
 * is inserted to the stream and append it at the end to B. If no non-repeating character is
 * found, append '#' at the end of B.
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 */
public class firstNonRepeatingCharacter {
    public static String solve(String A){
        Queue<Character> q = new LinkedList<Character>();
        int[] charCount =  new int[26];
        String B = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< A.length();i++){
            char c = A.charAt(i);

            q.add(A.charAt(i));
            charCount[c -'a']++;
            while(!q.isEmpty() && charCount[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                sb = sb.append('#');
            } else {
                sb = sb.append(q.peek());
            }


        }

        B = sb.toString();
        return B;
    }
    public static void main(String[] args) {
        String A = "abadbc"; // output: aabbdd
        //String A = "abcabc"; // output: aaabc#
        System.out.println(solve(A));
    }
}
