package my;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dean on 16/10/21.
 */
public class Best_Time_to_Buy_and_Sell_Stock_III {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE,buy2 = Integer.MIN_VALUE,sell1 = 0,sell2 = 0;
        for (int i = 0;i < prices.length; ++i){
            buy1 = Math.max(buy1,-prices[i]);
            sell1 = Math.max(sell1,prices[i] + buy1);
            buy2 = Math.max(buy2,sell1 - prices[i]);
            sell2 = Math.max(sell2,buy2 + prices[i]);
        }
        return sell2;

    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_III b = new Best_Time_to_Buy_and_Sell_Stock_III();
        System.out.println(b.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
}
