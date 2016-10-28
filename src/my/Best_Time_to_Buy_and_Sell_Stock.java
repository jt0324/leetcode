package my;

import sun.nio.cs.ext.MacHebrew;

/**
 * Created by dean on 16/10/15.
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int[] profit = new int[prices.length];
        profit[0] = 0;
        int min = prices[0],max = 0;
        for (int i = 1;i < prices.length; ++i){
            profit[i] = Math.max(profit[i-1],prices[i] - min);
            if (profit[i] > max)
                max = profit[i];
            if (prices[i] < min)
                min = prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock b = new Best_Time_to_Buy_and_Sell_Stock();
        b.maxProfit(new int[]{7,1,5,3,6,4});
    }
}
