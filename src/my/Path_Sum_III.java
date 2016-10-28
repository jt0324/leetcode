package my;

/**
 * Created by dean on 16/10/26.
 */

import my.util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Path_Sum_III {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root != null){
            fun(root,sum);
            pathSum(root.left,sum);
            pathSum(root.right,sum);
        }
        return count;
    }
    public void fun(TreeNode root,int sum){
        if (root != null){
            if (sum - root.val == 0){
                count++;
            }
            fun(root.left,sum - root.val);
            fun(root.right,sum - root.val);
        }
    }
}
