package StriversSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Search2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m = mat.size();
        int n = mat.get(0).size();
        int lr = 0, rr = mat.size()-1;//m
        int lc = 0, rc = mat.get(0).size()-1;//n

        while(lr<= rr && lc<= rc){
            int midr = (lr+rr)/2;
            int midc = (lc+rc)/2;
            if(mat.get(midr).get(midc) == target){
                return true;
            }else if(mat.get(midr).get(midc) < target && mat.get(midr).get(rc) < target){
               lr = midr+1;
            }else if(mat.get(midr).get(midc) < target &&  mat.get(midr).get(rc) >= target){
                lr = midr ; lc =midc+1;
            }else if(mat.get(midr).get(midc) > target  && mat.get(midr).get(lc) <= target){
                lr = midr ; rc = midc-1;
            }else if(mat.get(midr).get(midc) > target && mat.get(midr).get(lc) > target){
                rr= midr-1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        //1,3,5,7],[10,11,16,20],[23,30,34,60
        //ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,3,5,7));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10,11,16,20));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(23,30,34,60));
        mat.add(arr1);
        mat.add(arr2);
        mat.add(arr3);
        System.out.println(searchMatrix(mat,0));
    }
}
