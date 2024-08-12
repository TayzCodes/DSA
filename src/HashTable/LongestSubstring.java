package HashTable;
import java.util.*;
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

         int i = 0;
        int ans = 0;
        int cnt = 0;
        Set<Character> hs = new HashSet<>();
        for(int j=0;j<s.length();j++){


            if(hs.contains(s.charAt(j))){
                while(hs.contains(s.charAt(j))){
                    hs.remove(s.charAt(i));
                    i++;
                }
                hs.add(s.charAt(j));
            }else{
                hs.add(s.charAt(j));
                ans  = Math.max(ans, j-i+1);

            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ddvf"));
    }
}
