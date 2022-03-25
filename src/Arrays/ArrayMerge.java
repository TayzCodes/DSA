package Arrays;

// Given a collection of intervals, represented as tuples, merge all overlapping intervals.

// For example:
//   Given [[1, 3], (2, 6), (8, 10), (15, 18) ], return [ (1 ,6), (8, 10), (15, 18)]
//   Given [(0, 3), (1, 2)], return [(0, 3)]
import java.util.*;
class ArrayMerge{
    public static void printMerge(ArrayList<ArrayList<Integer>> arr){
        int k = 0;

        while(k < arr.size()-1){
            int  j = k+1;
            ArrayList<Integer> currRange = arr.get(j);
            if(currRange.get(0) < arr.get(k).get(0) && currRange.get(1) < arr.get(k).get(1) ){
                // elminate the jth range completely
                arr.remove(currRange);
                k = j+1;
            }else if(currRange.get(0) < arr.get(k).get(1) && currRange.get(1) > arr.get(k).get(1)){
                // elminate the jth range completely
                // update first range end value

                arr.get(k).add( 1,currRange.get(1));
                arr.remove(currRange);
                k = j+1;
            }else {
                k = k+1;
            }
            // return update array
            for(int i = 0;i< arr.size();i++){


                System.out.println(""+arr.get(i).get(0) +","+arr.get(i).get(1)+"" );



            }


        }
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sub = new ArrayList<Integer>();
        sub.add(1);sub.add(3);
        arr.add(sub);
        sub = new ArrayList<Integer>();
        sub.add(2);sub.add(6);
        arr.add(sub);
        sub = new ArrayList<Integer>();
        sub.add(8);sub.add(10);
        arr.add(sub);
        //= new int[][]{{1,3},{2,6},{8,10}};
        printMerge(arr);

    }

}
