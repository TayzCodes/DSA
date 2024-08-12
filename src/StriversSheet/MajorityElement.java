package StriversSheet;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        /*int times = nums.length/3;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val) > times && !res.contains(val)){
                res.add(val);
            }
        }*/
        /**
         * Boyer moore voting algorithm
         * for n/3 there can be atmost only two elements holding good for the answer
         * elements appearing more than n/3 times
         * Logic : an array can be divided into n/3 parts and if there has to be any element greater than n/3 times than
         * atmost only 2 elements can hold good for this condition
         */
        ArrayList<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int ele1 = 0,ele2 = 0;
        for(int i = 0;i< nums.length;i++){
            if(count1 == 0 &&  nums[i] != ele2){
                count1 = 1;ele1 = nums[i];
            } else  if(count2 == 0 &&  nums[i] != ele1){
                count2 = 1;ele2 = nums[i];
            } else if(nums[i] == ele1){
                count1++;
            } else if( nums[i] == ele2){
                count2++;
            } else {
                count1--;count2--;
            }
        }

        count1 = 0; count2 = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == ele1){
                count1++;
            }else if(nums[i] == ele2){
                count2++;
            }
        }

        int thresh = nums.length/3;

        if(count1 > thresh){
            res.add(ele1);
        }
        if(count2 > thresh){
            res.add(ele2);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElement(nums));
    }
}
