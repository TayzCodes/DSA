import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class SubArrayModM {

    public static long maxMod(long[] arr, int M){
        long maxM = 0;
        long pre = 0;
        long s = 0;
        long maxsofar = 0;
        TreeSet<Long> st = new TreeSet<Long>();// O(1)  m-1
        st.add(0l);
        for(int i=0;i< arr.length;i++){
            pre = (pre + arr[i])% M;
            maxM = Math.max(maxM, pre);
            long it = 0; //closest maximum mod previously seen to the current pre
            /*for(long j:  st){
                if(j >=pre+1){
                    if(it!=0)
                        it = Math.min(j,it);
                    else
                        it = j;
                }
            }*/
            if(pre< maxsofar) {
                int itr = 1;
                it = st.ceiling(pre+1);
               /* boolean found = false;
                while (!found && itr <= st.size()) {
                    if (st.contains(pre + itr)) {
                        it = pre + itr;
                        found = true;
                    }
                    itr++;
                }*/
            }
            if(it != 0){
                maxM = Math.max(maxM, (pre-it+M)%M);
            }
            st.add(pre);
            maxsofar = Math.max(maxsofar,pre);
        }

        return maxM;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] arr = new long[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxMod(arr,M));
    }
}
//100000 513549451
//64 40 4 25 80 60 42 8 36 30 54 5 24 6
//            int[] arr = new int[]{1,2,3,4,5,6,7,-8,2,12,11};
//            int m  = 15;
//            System.out.println("res -> "+maxMod(arr,m));
