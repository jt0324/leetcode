package my;

/**
 * Created by dean on 16/10/20.
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
public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length - 1);
    }
    public TreeNode build(int[] nums,int low,int high){
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums,low,mid - 1);
        root.right = build(nums,mid + 1,high);
        return root;
    }
}
