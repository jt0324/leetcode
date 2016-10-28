package my;

/**
 * Created by dean on 16/10/26.
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
public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return fun(0,inorder.length,0,postorder.length,inorder,postorder);
    }
    public TreeNode fun(int inStart,int inEnd,int postStart,int postEnd,int[] inorder,int[] postorder){
        if (inStart >= inEnd || postStart >= postEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd-1]);
        int index = 0;
        for (int i = inStart;i < inEnd; ++i){
            if (inorder[i] == postorder[postEnd-1]){
                index = i;
                break;
            }
        }
        root.left = fun(inStart,index,postStart,postStart+index-inStart,inorder,postorder);
        root.right = fun(index + 1,inEnd,postStart+index-inStart,postEnd-1,inorder,postorder);

        return root;
    }
}
