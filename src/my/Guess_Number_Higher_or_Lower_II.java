package my;

/**
 * Created by dean on 16/11/7.
 */
public class Guess_Number_Higher_or_Lower_II {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 2][n + 2];
        for (int l = 1; l < n; l++)
            for (int i = 1; i <= n - l; i++) {
                int j = i + l;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++)
                    dp[i][j] = Math.min(dp[i][j], k + Math.max(dp[i][k - 1], dp[k + 1][j]));
            }
        return dp[1][n];
    }
}
