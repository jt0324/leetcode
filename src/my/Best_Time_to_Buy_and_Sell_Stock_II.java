package my;

/**
 * Created by dean on 16/10/21.
 */
public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0;i < prices.length-1; ++i){
            if (prices[i+1] >= prices[i]){
                max += (prices[i+1] - prices[i]);
            }
        }
        return max;
    }
}
