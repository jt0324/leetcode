package my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dean on 16/10/8.
 */
public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < nums1.length; ++i){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i]) + 1);
            }else {
                map.put(nums1[i],1);
            }
        }
        for (int i = 0;i < nums2.length; ++i){
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }else {
                map.remove(nums2[i]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0;i < list.size(); ++i){
            res[i] = list.get(i);
        }
        return res;

    }


    public static void main(String[] args) {
        Intersection_of_Two_Arrays_II intersection = new Intersection_of_Two_Arrays_II();
        int[] num1 = new int[]{1,2,2,3};
        int[] num2 = new int[]{2,2};
        intersection.intersect(num1,num2);
    }
}
