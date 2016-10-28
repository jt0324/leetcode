package my;

/**
 * Created by dean on 16/10/20.
 */

import my.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Binary_Tree_Preorder_Traversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null){
            res.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return res;
    }
}
