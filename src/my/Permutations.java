package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/9.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,nums,new ArrayList<Integer>());
        return res;
    }
    public void fun(List<List<Integer>> res,int[] nums,List<Integer> tempList){
        if (tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = 0;i < nums.length; ++i){
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                fun(res,nums,tempList);
                tempList.remove(tempList.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.permute(new int[]{1,2,3});
    }
}
