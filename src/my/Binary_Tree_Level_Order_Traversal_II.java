package my;

/**
 * Created by dean on 16/10/28.
 */

import my.util.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        fun(root,res,1);
        return res;

    }
    public void fun(TreeNode root,List<List<Integer>>res,int level){
        if (root != null){
            if (res.size() > (level - 1)){
                res.get(res.size() - level).add(root.val);
            }else{
                res.add(0,new ArrayList<Integer>(Arrays.asList(root.val)));
            }
            fun(root.left,res,level + 1);
            fun(root.right,res,level + 1);
        }
    }
}
