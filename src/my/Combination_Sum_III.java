package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/11.
 */
public class Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),k,n,1);
        return res;
    }
    public void fun(List<List<Integer>> res,List<Integer> tempList,int k,int n,int start){
        if (n < 0) return;
        if (n == 0 && k == 0){
            res.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start;i <= 9; ++i){
                if (tempList.contains(i)) continue;
                tempList.add(i);
                fun(res,tempList,k - 1,n - i,i + 1);
                tempList.remove(tempList.size() -1);
            }
        }
    }
}
