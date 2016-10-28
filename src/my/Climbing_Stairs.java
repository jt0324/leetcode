package my;

/**
 * Created by dean on 16/10/15.
 */
public class Climbing_Stairs {
    public int climbStairs(int n) {
        int[] sum = new int[n+1];
        sum[0] = 1;
        sum[1] = 1;
        for (int i = 2 ;i <= n;++i){
            sum[i] = sum[i - 2] + sum[i - 1];
        }
        return sum[n];
    }
}
