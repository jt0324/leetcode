package my;

import com.sun.tools.jdi.LinkedHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/6.
 */
public class Single_Number {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length; ++i){
            if (map.containsKey(nums[i]) == false){
                map.put(nums[i],1);
            }else{
                map.remove(nums[i]);
            }
        }
        return Integer.parseInt(map.keySet().toArray()[0].toString());
    }

    public static void main(String[] args) {
        Single_Number single_number = new Single_Number();
        int[] temp = {1,3,1,2,4,3,4};
        System.out.println(single_number.singleNumber(temp));
    }
}
