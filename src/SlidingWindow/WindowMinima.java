package SlidingWindow;
import java.util.*;
public class WindowMinima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];

        for( int i=0; i<n; i++) arr[i] = sc.nextLong();

        int k = sc.nextInt();

        long sum = 0 ;

       /* for( int i=0; i< n-k+1; i++){

            long min = Long.MAX_VALUE;

            for( int j = i; j < i+k; j++){
                min = Math.min( min , arr[j]);
            }

            ans += min;
        }  */


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[queue.peek()] >= arr[i]) {
                queue.poll();
            }
            queue.offer(i);
        }
        sum += arr[queue.peek()];
        for (int i = k; i < n; i++) {
            while (!queue.isEmpty() && queue.peek() <= i-k) {
                queue.poll();
            }
            while (!queue.isEmpty() && arr[queue.peek()] >= arr[i]) {
                queue.poll();
            }
            queue.offer(i);
            sum += arr[queue.peek()];
        }

        System.out.println( sum);
    }
}
