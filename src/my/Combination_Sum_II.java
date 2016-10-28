package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/10.
 */
public class Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }

    public void fun(List<List<Integer>> res,List<Integer> tempList,int[] candidates,int target,int start){
        if (target < 0) return;
        if (target == 0){
            res.add(new ArrayList<>(tempList));
        }
        for (int i = start;i < candidates.length; ++i){
            tempList.add(candidates[i]);
            fun(res,tempList,candidates,target - candidates[i],i + 1);
            tempList.remove(tempList.size() - 1);
            while (i < candidates.length - 1 && candidates[i] == candidates[i + 1]) ++i;
        }
    }
}
