package CodeForcesEduRound220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParitySort {
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

    public static boolean isParityPossible(int n, int[] arr){
        boolean ans = true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCnt = 0;
        int oddcnt = 0;

        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                evenCnt++;
            }else{
                oddcnt++;
            }
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        if(oddcnt == evenCnt && oddcnt%2 !=0){
            return false;
        }
        if((max%2 == 0 && arr[n-1]%2 !=0 ) ||
                (max%2 != 0 && arr[n-1]%2 ==0) ||
                (min%2 != 0 && arr[0]%2 ==0) ||
                (min%2 == 0 && arr[0]%2 !=0) ){
            return false;

        }
        return ans;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-- >0){
            int n = fs.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = fs.nextInt();

            }
            if(isParityPossible(n,arr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
