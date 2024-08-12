package CodeForcesEduRound220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Conversation {
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
    public static int getNumberOfConversations(int n, int m, int k, int H, int[] arr){
        int maxHeight = m*k;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(Math.abs(H-arr[i]) > 0 && Math.abs(H-arr[i]) <= maxHeight-k ){
                if(Math.abs(H-arr[i])%k == 0 ) {
                    count++;
                }
            }
        }

        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int H = sc.nextInt();
            int[] harr = new int[n];
            for (int i = 0; i < n; i++) {
                harr[i] = sc.nextInt();
            }
            System.out.println(getNumberOfConversations(n,m,k,H,harr));
        }



    }
}
