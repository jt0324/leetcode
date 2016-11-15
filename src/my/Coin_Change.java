package my;

import java.util.Arrays;

/**
 * Created by dean on 16/11/11.
 */
public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1;i <= amount; ++i){
            dp[i] = Integer.MAX_VALUE;
            for (int coin:coins){
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i],dp[i - coin] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1:dp[amount];
    }
}
