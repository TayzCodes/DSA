package Design;

import java.util.*;

/**
 * GOOD SOLUTION:
 * class SummaryRanges {
 *
 *     ArrayList<int[]> ranges;
 *     public SummaryRanges() {
 *         ranges = new ArrayList<>();
 *     }
 *
 *     private void addValueToRange(int value, int index) {
 *         int[] range = ranges.get(index);
 *         int rangeLow = range[0], rangeHigh = range[1];
 *         if (index > 0 && value == rangeLow - 1 && ranges.get(index - 1)[1] + 1 >= value) {
 *             // ex. 3-3 5-6 [insert 4] - merge with left one
 *             ranges.get(index - 1)[1] = rangeHigh;
 *             ranges.remove(index);
 *             return;
 *         } else if (index + 1 < ranges.size() && value == rangeHigh + 1 && ranges.get(index + 1)[0] - 1 <= value) {
 *             // ex. 3-3 [insert 4] 5-6 - merge with right
 *             ranges.get(index)[1] = ranges.get(index + 1)[1];
 *             ranges.remove(index + 1);
 *             return;
 *         }
 *         if (value == rangeLow - 1) {
 *             ranges.get(index)[0] = value;
 *         } else if (value == rangeHigh + 1) {
 *             ranges.get(index)[1] = value;
 *         }
 *     }
 *
 *     public void addNum(int value) {
 *         if (ranges.isEmpty()) {
 *             ranges.add(new int[] {value, value});
 *             return;
 *         }
 *
 *         int left = 0, right = ranges.size() - 1;
 *         while (left < right) {
 *             int middle = (left + right) / 2;
 *             int[] currentRange = ranges.get(middle);
 *             int currentRangeLow = currentRange[0], currentRangeHigh = currentRange[1];
 *             if (value < currentRangeLow - 1) {
 *                 right = middle - 1;
 *                 continue;
 *             }
 *             if (value > currentRangeHigh + 1) {
 *                 left = middle + 1;
 *                 continue;
 *             }
 *             // value >= currentRangeLow - 1 && value <= currentRangeHigh + 1, so it's in range
 *             addValueToRange(value, middle);
 *             return;
 *         }
 *         if (left == right && value >= ranges.get(left)[0] - 1 && value <= ranges.get(left)[1] + 1) {
 *             addValueToRange(value, left);
 *             return;
 *         }
 *
 *         int index = Math.max(left, right);
 *         while (index >= 0 && ranges.get(index)[0] > value) {
 *             index--;
 *         }
 *         ranges.add(index + 1, new int[] {value, value});
 *     }
 *
 *     public int[][] getIntervals() {
 *         int[][] results = new int[ranges.size()][];
 *         for (int i = 0; i < ranges.size(); i++) {
 *             results[i] = ranges.get(i);
 *         }
 *         return results;
 *     }
 * }
 */
public class DataStream {
    static class SummaryRanges {

        ArrayList<Integer> arr =  new ArrayList<>();
        public SummaryRanges() {

        }

        public void addNum(int value) {
            if(!this.arr.contains(value))this.arr.add(value);
            Collections.sort(arr);
        }

        public int[][] getIntervals() {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            boolean formnew = true;
            int i = 0;
            while(i < this.arr.size()){
                ArrayList<Integer> newarr = new ArrayList<>();
                newarr.add(this.arr.get(i));
                int nextVal = this.arr.get(i)+1;
                while( i+1 < this.arr.size() && this.arr.get(i+1) == nextVal ){
                    i++;
                    nextVal =  this.arr.get(i)+1;
                }
                newarr.add(this.arr.get(i));
                res.add(newarr);
                i++;
            }

            int[][] intervals = new int[res.size()][2];
            for(int j = 0;j< res.size();j++){
                intervals[j][0] = res.get(j).get(0);
                intervals[j][1] = res.get(j).get(1);
            }

            return intervals;


        }


    }

    public static void main(String[] args) {
        SummaryRanges obj = new SummaryRanges();
        obj.addNum(1);      // arr = [1]
        obj.getIntervals(); // return [[1, 1]]
        obj.addNum(3);      // arr = [1, 3]
        int[][] res =  obj.getIntervals(); // return [[1, 1], [3, 3]]
        System.out.print("[");
        for(int j = 0;j< res.length;j++){
            System.out.print("["+ res[j][0] +","+res[j][1] +"]");
        }
        System.out.println("]");
        obj.addNum(7);      // arr = [1, 3, 7]
        res = obj.getIntervals(); // return [[1, 1], [3, 3], [7, 7]]
        System.out.print("[");
        for(int j = 0;j< res.length;j++){
            System.out.print("["+ res[j][0] +","+res[j][1] +"]");
        }
        System.out.println("]");
        obj.addNum(2);      // arr = [1, 2, 3, 7]
        res = obj.getIntervals(); // return [[1, 3], [7, 7]]
        System.out.print("[");
        for(int j = 0;j< res.length;j++){
            System.out.print("["+ res[j][0] +","+res[j][1] +"]");
        }
        System.out.println("]");
        obj.addNum(6);      // arr = [1, 2, 3, 6, 7]
        res = obj.getIntervals(); // return [[1, 3], [6, 7]]
        System.out.print("[");
        for(int j = 0;j< res.length;j++){
            System.out.print("["+ res[j][0] +","+res[j][1] +"]");
        }
        System.out.println("]");
    }
}
