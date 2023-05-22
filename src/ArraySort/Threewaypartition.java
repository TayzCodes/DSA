package ArraySort;
import java.util.*;

public class Threewaypartition {

    public  static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal)
    {
        int n = A.size();
        ArrayList<Integer> arr = A;
        int start = 0, end = n-1;
        for (int i=0; i<=end;)
        {
            // swapping the element with those at start
            // if array element is less than lowVal
            if (arr.get(i) < lowVal){
                int temp=arr.get(i);
                arr.add(i,arr.get(start));
                arr.remove(i+1);
                arr.add(start,temp);
                arr.remove(start+1);
                i++;
                start++;
            }

            // swapping the element with those at end
            // if array element is greater than highVal
            else if (arr.get(i) > highVal){
                int temp=arr.get(i);
                arr.add(i,arr.get(end));
                arr.remove(i+1);
                arr.add(end,temp);
                arr.remove(end+1);
                end--;
            }

            // else just move ahead
            else
                i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,8,3,3,9));

        int low = 3, high = 5;
        System.out.println(threeWayPartition(A,low,high));
    }
}
