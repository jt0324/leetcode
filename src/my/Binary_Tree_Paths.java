package my;

/**
 * Created by dean on 16/10/24.
 */

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
public class Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        preOrder(root,res,new ArrayList<Integer>());
        return res;
    }
    public void preOrder(TreeNode root,List<String> res,List<Integer> temp){
        if (root != null){
            temp.add(root.val);
            if (root.left == null && root.right == null){
                String route = "";
                for (int i = 0;i < temp.size(); ++i){
                    if (i != temp.size() - 1){
                        route += (temp.get(i) + "->");
                    }else{
                        route += temp.get(i)+"";
                    }
                }
                res.add(route);
            }
            else {
                preOrder(root.left,res,temp);
                preOrder(root.right,res,temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
