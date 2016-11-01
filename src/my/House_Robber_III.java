package my;

/**
 * Created by dean on 16/10/28.
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
public class House_Robber_III {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int val = 0;
        if (root.left != null){
            val += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null){
            val += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(val + root.val,rob(root.left) + rob(root.right));
    }

}
