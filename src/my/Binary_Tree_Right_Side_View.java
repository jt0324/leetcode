package my;

/**
 * Created by dean on 16/10/24.
 */

import my.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        fun(map,1,root);
        return new ArrayList<>(map.values());
    }
    public void fun(Map<Integer,Integer> map, int depth, TreeNode root){
        if (root != null){
            map.put(depth,root.val);
            fun(map,depth + 1,root.left);
            fun(map,depth + 1,root.right);
        }
    }
}
