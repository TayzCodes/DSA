// package CodeForcesEduRound220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Did {

    public static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    public static boolean findKey(String[] keys, String pat ){
        boolean foundKey = false;

        for(int i =0;i< keys.length;i++){
            if(pat.equalsIgnoreCase(keys[i])){
                foundKey = true;
                break;
            }
        }
        return foundKey;
    }
    public static String findResult( String map){
        String ans = "YES";

        String[] keys = new String[4];

        String[] mapPattern = map.split("");
        int keyCount = 0;
        for(int i=0;i< mapPattern.length;i++){
            if(mapPattern[i].equals("r")||
                    mapPattern[i].equals("g")||
                    mapPattern[i].equals("b")){
                keys[keyCount++] = mapPattern[i];
            } else {
                if(!findKey(keys,mapPattern[i])){
                    ans = "NO";
                    break;
                }
            }

        }

        return ans;


    }
    public static void main(String args[]){
        FastScanner fs = new FastScanner();

        int t = fs.nextInt();
        String[] result = new String[t+1];
        for(int i =0;i< t;i++){
            String mapStr = fs.next();
            System.out.println(findResult(mapStr));
        }
        return;
//            for(int i =0;i< t;i++){
//                System.out.println(result[i]);
//
//            }

    }
}


