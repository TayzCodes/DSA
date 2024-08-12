package StriversSheet;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FindDuplicate {
    /**
     * A more mathematical solution involving the n value
      * @param arr
     * @param n
     */
    private static void findDuplicate(int[] arr, int n){
        for(int i=0;i<n;i++){
            int idx = arr[i]%n;
            arr[idx] += n;

        }
        System.out.println("Duplicates are");
        for(int i=0;i<n;i++){
          //  System.out.println("val -> "+arr[i]/n);
            if(arr[i]/n >=2){
                System.out.println(" "+i);
            }
        }
    }
    private static void findDuplicateFSpointer(int[] arr, int n){
        int s = arr[0];
        int f = arr[0];
        do{
            s = arr[s];
            f = arr[arr[f]];
        }while(s!=f);
        s = arr[0];
        while(s!=f){
            s= arr[s];
            f = arr[f];
        }
        System.out.println(""+s);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,4,2};
        int n = arr.length;
        findDuplicateFSpointer(arr,n);
    }
}
