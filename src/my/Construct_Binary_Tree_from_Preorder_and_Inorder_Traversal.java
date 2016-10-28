package my;

/**
 * Created by dean on 16/10/24.
 */

import apple.laf.JRSUIUtils;
import my.util.TreeNode;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return fun(0,preorder.length,0,inorder.length,preorder,inorder);
    }
    public TreeNode fun(int preStart,int preEnd,int inStart,int inEnd,int[] preorder,int[] inorder){
        if (preStart >= preEnd || inStart >= inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = inStart;
        for (int i = inStart;i < inEnd; ++i){
            if (inorder[i] == preorder[preStart])
                index = i;
        }
        root.left = fun(preStart + 1,index - inStart + 1 + preStart,inStart,index,preorder,inorder);
        root.right = fun(index - inStart + 1 + preStart,preEnd,index + 1,inEnd,preorder,inorder);
        return root;
    }
    public static void main(String[] args) {
       Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal c = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        c.buildTree(new int[]{1,3,2,4,6,5},new int[]{1,2,3,4,5,6});
    }
}
