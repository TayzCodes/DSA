package Arrays;
import java.util.*;
public class DivideArray {
    public static boolean divideArray(int[] nums) {
        boolean ans = true;
        if(nums.length % 2 != 0) return false;
        else {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int i =0;i< nums.length; i++){
                if(hm.get(nums[i]) != null){
                    hm.put(nums[i],hm.get(nums[i])+1);
                }else{
                    hm.put(nums[i],1);
                }
            }

            for(int i =0;i< nums.length; i++){
                if(hm.get(nums[i])%2 != 0)
                {
                    ans=false;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{15,1,4,8,12,11,4,10,4,10,10,15,20,7};
        System.out.println(divideArray(nums));
    }
}
