package BinarySearch;

public class SearchInsertPos {
    //OPTIMAL
    /*public int searchInsert(int[] nums, int target) {
        int ans = -1;
        int l = 0, r = nums.length-1;


        while(l<=r){
            int mid = l+(r-l)/2;
            // ans = mid;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]> target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }//while

        return l;
    }*/
    public static int searchInsert(int[] nums, int target) {
        int ans = -1;
        int l = 0, r = nums.length-1;
        if(nums[l] >= target){
            return 0;
        }
        if(nums[r] < target){
            return nums.length;
        }

        while(l<r){
            int mid = l+(r-l)/2;
            ans = mid;
            if(nums[mid] == target){
               return ans;
            }
            if(nums[mid]> target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }//while
        if(l==r){

            if(nums[l] < target){
                ans = l+1;
            }else {
                ans = l;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int t = 3;
        System.out.println(searchInsert(nums,t));
    }
}
