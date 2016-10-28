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
public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = fun(root.left);
        int right = fun(root.right);
        if (Math.abs(left - right) > 1)
            return false;
        else
            return (isBalanced(root.left) && isBalanced(root.right));
    }

    public int fun(TreeNode root){
        if (root == null) return 0;
        int left = 1 + fun(root.left);
        int right = 1 + fun(root.right);
        return left > right?left:right;
    }
}
