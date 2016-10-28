package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/10.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),n,k,1);
        return res;
    }
    public void fun(List<List<Integer>> res,List<Integer> tempList,int n,int k,int start){
        if (k == 0){
            res.add(new ArrayList<Integer>(tempList));
        }
        for (int i = start;i <= n; ++i){
            tempList.add(i);
            fun(res,tempList,n,k-1,i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
