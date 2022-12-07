package Strings;
import java.util.*;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/description/
 *
 * ALternatively use TreeSet
 * 
 */
public class SortCharacterByFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> charFreq =  new HashMap<Character, Integer>();
        for(int i=0;i< s.length();i++){
            char c = s.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>(
                new Comparator<Character>(){
                    public int compare(Character c1, Character c2){
                        if(charFreq.get(c1) < charFreq.get(c2)){
                            return 1;
                        }else if(charFreq.get(c1) > charFreq.get(c2)){
                            return -1;
                        }else{
                            return 0;
                        }
                    }
                }
        );
        for(Map.Entry<Character, Integer> entry: charFreq.entrySet()){
            Character c = entry.getKey();
            pq.add(c);
            Character cvb = pq.peek();
            //System.out.println(cvb);
        }
        StringBuilder sb  =  new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            for(int i= 0;i< charFreq.get(c);i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
     //  System.out.println(frequencySort("tree"));
    //   System.out.println(frequencySort("abbbaacacf"));
      //  System.out.println(frequencySort("abbbaacacf"));
    }
}
