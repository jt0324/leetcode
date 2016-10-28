package my;

/**
 * Created by dean on 16/10/26.
 */

import apple.laf.JRSUIUtils;
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
public class Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        List<TreeNode> preOrder = new ArrayList<>();
        fun(preOrder,root);
        for (int i = 0;i < preOrder.size() - 1; ++i){
            preOrder.get(i).left = null;
            preOrder.get(i).right = preOrder.get(i + 1);
        }
    }
    public void fun(List<TreeNode> preOrder,TreeNode root){
        if (root != null){
            preOrder.add(root);
            fun(preOrder,root.left);
            fun(preOrder,root.right);
        }
    }
}
