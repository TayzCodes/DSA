package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * A mapping of digits to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
public class NumberPad {
    static HashMap<Character, char[]> numPad = new HashMap<>();
    static List<String> result;
    static void buildCombination(String ip, int idx, String pre){

        if(idx == ip.length()-1){
            char c = ip.charAt(idx);
            char[] vals = numPad.get(c);
            for(int i = 0;i<vals.length;i++){
                result.add(pre+vals[i]);
            }
        }else{
            char c = ip.charAt(idx);
            char[] vals = numPad.get(c);
            for(int i = 0;i<vals.length;i++){
                buildCombination(ip, idx+1,pre+vals[i]);
            }


        }

    }


    public static void main(String[] args) {
        numPad.put('2', new char[]{'a','b','c'});
        numPad.put('3', new char[]{'d','e','f'});
        numPad.put('4', new char[]{'g','h','i'});
        numPad.put('5', new char[]{'j','k','l'});
        numPad.put('6', new char[]{'m','n','o'});
        numPad.put('7', new char[]{'p','q','r','s'});
        numPad.put('8', new char[]{'t','u','v'});
        numPad.put('9', new char[]{'w','x','y','z'});
        result = new ArrayList<>();
        String ip= "237";
        buildCombination(ip, 0, "");

        System.out.println(result.toString());
    }


}
