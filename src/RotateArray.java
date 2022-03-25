import java.util.Arrays;
import java.util.Collections;

public class RotateArray {

    public static void reverse(int[] arr, int l, int r){
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
    public static void rotareRight(int[] arr, int k){
         k = k%(arr.length);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0, arr.length-1);
    }


    public static void main(String[] args){
        int[] arr =  new int[]{1,2,3,4,5,6,7,8};

        rotareRight(arr,4);
        for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]);
        System.out.println();
    }
}
