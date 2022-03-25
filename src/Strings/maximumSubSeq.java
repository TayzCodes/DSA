package Strings;
import java.util.*;
/**
 * https://leetcode.com/contest/biweekly-contest-74/problems/maximize-number-of-subsequences-in-a-string/
 * 6021. Maximize Number of Subsequences in a String
 * You are given a 0-indexed string text and another 0-indexed string pattern of length 2, both of which
 * consist of only lowercase English letters.
 * You can add either pattern[0] or pattern[1] anywhere in text exactly once. Note that the character can be added even at
 * the beginning or at the end of text.
 * Return the maximum number of times pattern can occur as a subsequence of the modified text.
 * A subsequence is a string that can be derived from another string by deleting some or no characters without
 * changing the order of the remaining characters.



        Example 1:

        Input: text = "abdcdbc", pattern = "ac"
        Output: 4
        Explanation:
        If we add pattern[0] = 'a' in between text[1] and text[2], we get "abadcdbc". Now, the number of times "ac" occurs as a subsequence is 4.
        Some other strings which have 4 subsequences "ac" after adding a character to text are "aabdcdbc" and "abdacdbc".
        However, strings such as "abdcadbc", "abdccdbc", and "abdcdbcc", although obtainable, have only 3 subsequences "ac" and are thus suboptimal.
        It can be shown that it is not possible to get more than 4 subsequences "ac" by adding only one character.
        Example 2:

        Input: text = "aabb", pattern = "ab"
        Output: 6
        Explanation:
        Some of the strings which can be obtained from text and have 6 subsequences "ab" are "aaabb", "aaabb", and "aabbb".


        Constraints:

        1 <= text.length <= 105
        pattern.length == 2
        text and pattern consist only of lowercase English letters.
 **/
public class maximumSubSeq {
    public static long maximumSubsequenceCount(String text, String pattern) {
        char[] textArr = text.toCharArray();
        char[] patArr = pattern.toCharArray();

        long out = 0;
        int[] patOccur = new int[2];
        HashMap<Integer, long[]>  hm = new HashMap<Integer, long[]>();

        for(int i=textArr.length-1;i>=0 ;i--){
            long val1 = 0;
            long val2 = 0;


           if(i < textArr.length-1 ){
               long[] arrStat = hm.get(i+1);
                if(patArr[0] == patArr[1]){
                    if(arrStat[1]> 0){
                        if (textArr[i] == patArr[0]) {
                            val1 = arrStat[0] + 1;
                            val2 = arrStat[1];
                        } else if (textArr[i] == patArr[1]) {
                            val2 = arrStat[1] + 1;
                            val1 = 0;
                        } else {
                            val1 = arrStat[0];
                            val2 = arrStat[1];
                        }
                    }else {
                        if(textArr[i] == patArr[1]){val2 = 1;}
                        else if(textArr[i] == patArr[0]){val1 = 1;}
                    }
                }else {
                    if (textArr[i] == patArr[0]) {
                        val1 = arrStat[0] + 1;
                        val2 = arrStat[1];
                    } else if (textArr[i] == patArr[1]) {
                        val2 = arrStat[1] + 1;
                        val1 = 0;
                    } else {
                        val1 = arrStat[0];
                        val2 = arrStat[1];
                    }
                }
           }else {
                if(textArr[i] == patArr[1]){val2 = 1;}
               else if(textArr[i] == patArr[0]){val1 = 1;}

           }
            hm.put(i,new long[]{val1,val2} );


        }

        for(int i=0;i< textArr.length;i++){
            long[] arrStat = hm.get(i);

            long val1 = arrStat[0];
            long val2 = arrStat[1];
            if(i>0) {
                long[] arrStat1 = hm.get(i-1);
                if(patArr[0] == patArr[1] && textArr[i] == patArr[0]){
                    out = out + val1*val2;
                }
                else {
                    if (arrStat1[1] != val2)
                        out = out + val1 * val2;
                }
            } else {
                out = out + ((val1+1)*val2);
                if(patArr[0] == patArr[1] && textArr[i] == patArr[0]){
                    out = out + val1*val2;
                }

            }

        }
        long out2 = 0;
        for(int i=0;i< textArr.length;i++){
            long[] arrStat = hm.get(i);

            long val1 = arrStat[0];
            long val2 = arrStat[1];
            if(i>0) {
                long[] arrStat1 = hm.get(i-1);
                if(patArr[0] == patArr[1] && textArr[i] == patArr[0]){
                    out2 = out2 +(val1*val2);
                }else {
                    if (arrStat1[1] != val2)
                        out2 = out2 + val1 * (val2 + 1);
                }
            } else {
                if(patArr[0] == patArr[1]) {
                    out2 = out2 + (val1+1) * val2 ;
                }else {
                    out2 = out2 + (val1 * (val2 + 1));
                }

            }

        }

        return Math.max(out,out2);

    }

    public static void main(String[] args) {

//        String text = "iekbksdsmuuzwxbpmcngsfkjvpzuknqguzvzik";//"abdcdbc";
//        String pat = "mp";//"ac";
//        String text = "abdcdbc";
//        String pat = "ac";
//        String text ="aabb";
//        String pat ="ab";
//        String text ="zigfj";
//        String pat ="ju";
//        String text ="rozsjqzottomeiytlvkenctevztfjlgszlv";
//        String pat ="tc";
//        String text ="jdxm";
//        String pat ="pe";
//        String text = "vnedkpkkyxelxqptfwuzcjhqmwagvrglkeivowvbjdoyydnjrqrqejoyptzoklaxcjxbrrfmpdxckfjzahparhpanwqfjrpbslsyiwbldnpjqishlsuagevjmiyktgofvnyncizswldwnngnkifmaxbmospdeslxirofgqouaapfgltgqxdhurxljcepdpndqqgfwkfiqrwuwxfamciyweehktaegynfumwnhrgrhcluenpnoieqdivznrjljcotysnlylyswvdlkgsvrotavnkifwmnvgagjykxgwaimavqsxuitknmbxppgzfwtjdvegapcplreokicxcsbdrsyfpustpxxssnouifkypwqrywprjlyddrggkcglbgcrbihgpxxosmejchmzkydhquevpschkpyulqxgduqkqgwnsowxrmgqbmltrltzqmmpjilpfxocflpkwithsjlljxdygfvstvwqsyxlkknmgpppupgjvfgmxnwmvrfuwcrsadomyddazlonjyjdeswwznkaeaasyvurpgyvjsiltiykwquesfjmuswjlrphsdthmuqkrhynmqnfqdlwnwesdmiiqvcpingbcgcsvqmsmskesrajqwmgtdoktreqssutpudfykriqhblntfabspbeddpdkownehqszbmddizdgtqmobirwbopmoqzwydnpqnvkwadajbecmajilzkfwjnpfyamudpppuxhlcngkign";
//        String pat = "rr";
//       String text = "abcrjarkr";

        String text = "aaa";
        String pat = "aa";

        System.out.println(maximumSubsequenceCount(text,pat));
    }

}
