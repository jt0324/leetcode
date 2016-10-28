package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/7.
 */
public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0 ;i < len; ++i){
            if (map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                if (++value > len/2){
                    return nums[i];
                }
                map.put(nums[i],value);
            }else {
                map.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
