package my;

/**
 * Created by dean on 16/10/24.
 */

import my.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return fun(root.left,root.right);
    }
    public boolean fun(TreeNode left,TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val){
            return fun(left.left,right.right) && fun(left.right,right.left);
        }
        else
            return false;
    }

}
