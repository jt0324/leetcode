package my;

/**
 * Created by dean on 16/10/20.
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
public class Kth_Smallest_Element_in_a_BST {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return list.get(--k);
    }
    public void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}
