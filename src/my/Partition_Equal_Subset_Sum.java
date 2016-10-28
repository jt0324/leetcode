package my;

import java.util.*;

/**
 * Created by dean on 16/10/15.
 */
public class Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0;i < nums.length; ++i){
            sum += nums[i];
        }
        if (sum%2 != 0) return false;
        sum/=2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 1;i <= nums.length; ++i){
            for (int j = sum; j >= nums[i-1];--j){
                dp[j] = dp[j] || dp[j - nums[i-1]];
            }
        }
        return dp[sum];
    }
}
