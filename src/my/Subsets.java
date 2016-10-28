package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/7.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,nums,new ArrayList<Integer>(),0);
        return list;
    }
    public void backtrack(List<List<Integer>> list,int[] nums,List<Integer> temps,int start){
        list.add(new ArrayList<Integer>(temps));
        for (int i = start;i < nums.length; ++i){
            temps.add(nums[i]);
            backtrack(list,nums,temps,i + 1);
            temps.remove(temps.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
    }
}
