package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/9/30.
 */
public class Two_Sum {
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; ++i){
//            for(int j = i + 1 ; j< nums.length; ++j){
//                if(nums[i] + nums[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }
//        return res;
//    }
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length; ++i){
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            else {
                map.put(target - nums[i],i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Two_Sum two_sum = new Two_Sum();
        int[] nums = {2, 7, 11, 15};
        System.out.println(two_sum.twoSum(nums,9)[1]);
    }
}
