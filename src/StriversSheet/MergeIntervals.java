package StriversSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));

        for(int i =0;i< intervals.length;i++){

            if(res.isEmpty() || res.getLast()[1] <  intervals[i][0]){
                res.add(intervals[i]);
            }else{
                    //merge the list now
                res.getLast()[1] = Math.max(intervals[i][1], res.getLast()[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {

    }
}
