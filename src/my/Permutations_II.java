package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dean on 16/10/9.
 */
public class Permutations_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),nums,new boolean[nums.length]);
        return res;
    }
    public void fun(List<List<Integer>> res,List<Integer> tempList,int[] nums,boolean[] used){
        if (tempList.size() == nums.length){
            res.add(new ArrayList<Integer>(tempList));
        }
        for (int i = 0;i < nums.length; ++i){
            if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            tempList.add(nums[i]);
            fun(res,tempList,nums,used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations_II permutations_ii = new Permutations_II();
        permutations_ii.permuteUnique(new int[]{1,1,2});
    }


}
