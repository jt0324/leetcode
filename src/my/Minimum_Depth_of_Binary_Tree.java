package my;

/**
 * Created by dean on 16/10/10.
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
public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + minDepth(root.left);
        int right = 1 + minDepth(root.right);
        if (left == 1) return right;
        else if(right == 1) return left;
        else return left > right? right:left;
    }
}
