package my;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dean on 16/11/15.
 */
public class Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true){
            n = getSum(n);
            if (n == 1) return true;
            if (!set.contains(n)){
                set.add(n);
            }else {
                return false;
            }
        }
    }
    public int getSum(int num){
        int sum = 0;
        while (num > 0){
            sum += Math.pow(num%10,2);
            num/=10;
        }
        return sum;
    }
}
