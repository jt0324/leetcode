package my;

/**
 * Created by dean on 16/11/7.
 */
public class Integer_Break {
    public int integerBreak(int n) {
        int[] res = new int[56];
        res[0] = 1;
        res[1] = 2;
        res[2] = 4;
        res[3] = 6;
        res[4] = 9;
        for (int i = 5;i < res.length; ++i){
            res[i] = 3 * res[i - 3];
        }
        return res[n-2];
    }
}
