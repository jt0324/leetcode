package my;

/**
 * Created by dean on 16/10/6.
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
public class Maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return left > right ? left:right;
    }
}
