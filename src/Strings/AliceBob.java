package Strings;
import java.util.*;

public class AliceBob {
    public static int solve(String A){
    HashMap<Character, Integer> hm  = new HashMap<>();
        hm.put('A',0);
        hm.put('B',0);
        for(int i = 0;i< A.length();i++){
        hm.put(A.charAt(i), hm.getOrDefault(A.charAt(i),0)+1);
    }

    int countA = 0;
    int countB = 0;int flagA = 0, flagB = 1;
        if(hm.get('A') == 0){
        return 0;
    }
        if(hm.get('B') == 0){
        return 0;
    }
        for(int i = 0;i< A.length();i++){
        if(flagA == 0 && hm.get('B') >0 && hm.get('A')>0){
            countA = hm.get('B');
            flagA = 1;
            flagB = 0;
        }else if(flagB == 0 && hm.get('A')>0) {
            countB = hm.get('A');
            flagA=0;
            flagB = 1;

        }else{
            if(countA > countB){
                return 1;
            }else{
                return 0;
            }
        }

    }

        if(countA > countB){
        return 1;
    }else {
        return 0;
    }
}

    public static void main(String[] args) {
        System.out.println(solve("AB"));
    }
}
