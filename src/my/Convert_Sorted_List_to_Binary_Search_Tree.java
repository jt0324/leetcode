package my;

/**
 * Created by dean on 16/10/26.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
public class Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while (head != null){
            res.add(head.val);
            head = head.next;
        }
        return fun(res,0,res.size()-1);
    }
    public TreeNode fun(List<Integer> list,int l,int r){
        if (l > r) return null;
        int index = (l + r)/2;
        TreeNode root = new TreeNode(list.get(index));
        root.left = fun(list,l,index - 1);
        root.right = fun(list,index + 1,r);
        return root;
    }
}
