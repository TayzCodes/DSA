package StriversSheet;

public class NextPermutation {
    public static void swap(int[] nums, int x, int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
    public static void nextPermutation(int[] nums) {
        int curr = nums.length-2;
        while(curr >= 0 && nums[curr+1] <= nums[curr]){
            curr--;
        }
        //System.out.print(curr);
        if(curr>=0){
            int next = curr;
            while(next< nums.length-1 && nums[next+1] >  nums[curr]){
                next++;
            }
            swap(nums, curr, next);
        }
        //reverse from prev+1 till end
        int i = curr+1,j=nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++;j--;
        }

        System.out.print("["+nums[0]);
        for(int k=1;k< nums.length-1;k++){
            System.out.print(","+nums[k]);
        }
        System.out.print(","+nums[nums.length-1]+"]");

    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2};
        nextPermutation(nums);
    }
    //5,1,1
    //1,1,5

}
