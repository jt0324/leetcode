package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/10.
 */
public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    public void fun(List<List<Integer>> res,List<Integer> tempList,int []candidates,int target,int start){
        if (target < 0) return;
        if (target == 0){
            res.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < candidates.length; ++i) {
                tempList.add(candidates[i]);
                fun(res, tempList, candidates, target - candidates[i],i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
