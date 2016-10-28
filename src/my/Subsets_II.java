package my;

import my.util.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/9.
 */
public class Subsets_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temps = new ArrayList<>();
        fun(list,0,nums,temps);
        return list;
    }
    public void fun(List<List<Integer>> list,int start,int[] nums,List<Integer> temps){
        List<Integer> newList = new ArrayList();
        for (int i = 0;i < temps.size(); ++i){
            newList.add(temps.get(i));
        }
        list.add(newList);
        for (int i = start;i < nums.length; ++i){
            temps.add(nums[i]);
            fun(list,i + 1,nums,temps);
            temps.remove(temps.size() - 1);
            while(i < nums.length-1 && nums[i] == nums[i+1]) i++;
        }
    }
}
