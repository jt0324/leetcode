package my;

/**
 * Created by dean on 16/10/24.
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
public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null){
            if (sum - root.val == 0 && (root.left == null && root.right == null)){
                return true;
            }
            return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
        }
        return true;
    }
}
