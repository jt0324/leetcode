package my;

/**
 * Created by dean on 16/11/29.
 */
public class Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        for (int i = 0;i < nums.length;++i){
            dp[i] = 1;
        }
        for (int i = 1;i < nums.length;++i){
            for (int j = 0;j < i;++j){
                if (nums[i] > nums[j] ){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int max = dp[0];
        for(int i = 1; i < dp.length; i++)
            if(max < dp[i])
                max = dp[i];
        return max;
    }

    public static void main(String[] args) {
        Longest_Increasing_Subsequence l = new Longest_Increasing_Subsequence();
        l.lengthOfLIS(new int[]{10,9,2,5,3,4});
    }
}
