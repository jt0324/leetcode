package my;

import java.util.Arrays;

/**
 * Created by dean on 16/10/21.
 */
public class Plus_One {
    public int[] plusOne(int[] digits) {
        int plus = 1;
        for (int i = digits.length - 1;i >= 0; --i){
            digits[i] += plus;
            plus = digits[i]/10;
            digits[i] %= 10;
        }
        if (plus == 1){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits,0,res,1,digits.length);
            return res;
        }
        return digits;
    }
}
