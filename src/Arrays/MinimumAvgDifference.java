package Arrays;

/**
 * https://leetcode.com/problems/minimum-average-difference/description/
 *
 *
 * Better memory utilization by making O(1) Space complexity
 * 1. find total sum
 * 2. while determing prefix at i, find the postfix at i and compute the avg on the go
 * 3. in the same loop, determine the avg and min average and corresponding i
 */
public class MinimumAvgDifference {
    public static int minimumAverageDifferenceBetter(int[] nums) {
        long sum = 0;
        for(int n: nums){
            sum+=n;

        }
        long prefix = 0;
        int ans = 0;
        int len = nums.length;
        int minAvg = Integer.MAX_VALUE;
        for(int i =0;i< len;i++){
            prefix = prefix + nums[i];
            long avg1 = prefix/(i+1);
            long avg2 = i == len-1 ? 0: ( sum -prefix)/(len-i-1);
            int diff = (int)Math.abs(avg1-avg2);
            if(diff < minAvg){
                ans = i;
                minAvg = diff;
            }

        }

        return ans;
    }
    public static int minimumAverageDifference(int[] nums) {
        long[] prefixSum = new long[nums.length];
        long[] postfixSum = new long[nums.length];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            prefixSum[i] = i == 0? nums[i] : (prefixSum[i-1]+nums[i]);
            postfixSum[n-i-1] = i == 0? nums[n-i-1]: (postfixSum[n-i]+nums[n-i-1]);
        }

        int minAvg = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i<n ;i++){
            int A =  Math.round(prefixSum[i]/(i+1));
            int B = i == n-1 ? 0: Math.round(postfixSum[i+1]/(n-i-1));
            int avgDiff = Math.abs(A-B);
            if(avgDiff <  minAvg){
                ans = i;
            }
            minAvg = Math.min(minAvg, avgDiff);
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] nums = new int[]{2,5,3,9,5,3};

        System.out.println(minimumAverageDifference(nums));

    }
}
