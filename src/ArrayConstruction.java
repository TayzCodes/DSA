import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;
public class ArrayConstruction {


        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            long[] vals = new long[N];
            long[] freq = new long[N];
            for(int i=0;i< N ;i++){
                vals[i] = sc.nextLong();
            }
            for(int i=0;i< N ;i++){
                freq[i] = sc.nextLong();
            }
            long K = sc.nextLong();

            Map<Long, Long> valFreq = new HashMap<>();
            for(int i=0;i< N ;i++){
                valFreq.put(vals[i],freq[i]);
            }
            Arrays.sort(vals);
            for(int i=0;i< N ;i++){
                K -= valFreq.get(vals[i]);
                if(K<=0){
                    System.out.print(vals[i]);
                    break;
                }
            }


        }
    }

