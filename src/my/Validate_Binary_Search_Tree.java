package my;

/**
 * Created by dean on 16/10/26.
 */

import my.util.ListNode;
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
public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        fun(root,inorder);
        for (int i = 0;i < inorder.size() - 1 ; ++i){
            if (inorder.get(i + 1) <= inorder.get(i)){
                return false;
            }
        }
        return true;
    }
    public void fun(TreeNode root,List<Integer> inorder){
        if (root != null){
            fun(root.left,inorder);
            inorder.add(root.val);
            fun(root.right,inorder);
        }
    }
}
