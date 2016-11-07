package my;

import java.util.List;

/**
 * Created by dean on 16/10/13.
 */
public class Count_Numbers_with_Unique_Digits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int[] res = new int[n];
        res[0] = 10;
        for (int i = 1;i < n; ++i){
            int temp = 9;
            for (int j = 0;j < i; ++j){
                temp *= (9-j);
            }
            res[i] = res[i - 1] + temp;
        }
        return res[n-1];
    }
}
