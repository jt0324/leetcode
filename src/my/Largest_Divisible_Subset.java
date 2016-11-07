package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/11/7.
 */
public class Largest_Divisible_Subset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0) return res;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxIndex = 0;
        for (int i = 1;i < nums.length; ++i){
            for (int j = i - 1;j >= 0;--j){
                if (nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                    if (dp[i] > dp[maxIndex])
                        maxIndex = i;
                }
            }
        }
        int maxNum = nums[maxIndex];
        for (int i = maxIndex;i >= 0; --i){
            if (maxNum % nums[i] == 0 && dp[i] == maxIndex--)
                res.add(nums[i]);
        }
        return res;
    }
}
