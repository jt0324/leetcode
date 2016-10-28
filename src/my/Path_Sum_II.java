package my;

/**
 * Created by dean on 16/10/26.
 */

import my.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,new ArrayList<Integer>(),root,sum);
        return res;
    }
    public void fun(List<List<Integer>> res,List<Integer> tempList,TreeNode root,int sum){
        if(root != null){
            tempList.add(root.val);
            if (sum-root.val == 0 && (root.left == null && root.right == null)) {
                res.add(new ArrayList<Integer>(tempList));

            }
            fun(res,tempList,root.left,sum - root.val);
            fun(res,tempList,root.right,sum - root.val);
            tempList.remove(tempList.size() - 1);
        }
    }
}
