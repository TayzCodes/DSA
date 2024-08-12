package DynamicProgramming;

import java.util.Arrays;

public class minCoins {
    static int[] dp;

    public static int coinChange(int[] coins, int target) {
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        return minPath(target, coins,0);
    }
    public static int minPath(int target, int[] coins, int count){
        int ans = Integer.MAX_VALUE;
        if(target == 0) return 0;

        if(dp[target] != -1){
            return dp[target];
        }
        for(int i =0;i< coins.length;i++){
            if(target-coins[i]>=0) {

                    int currCnt =  minPath(target - coins[i], coins, count + 1);
                    if(currCnt != Integer.MAX_VALUE && currCnt+1 < ans){
                        ans = currCnt+1;
                    }
            }
        }

        dp[target]= ans;
        return ans;

    }

    public static void main(String[] args) {
            int[] coins = new int[]{1,2,5};
            int target = 11;
        System.out.println(coinChange(coins, target));
    }
}
