package my;

import my.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/26.
 */
public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        fun(res,root,1);
        return res;
    }
    public void fun(List<List<Integer>> res,TreeNode root, int level){
        if (root != null){
            if (res.size() < level){
                res.add(new ArrayList<Integer>(Arrays.asList(root.val)));
            }else{
                res.get(level-1).add(root.val);
            }
            fun(res,root.left,level+1);
            fun(res,root.right,level+1);
        }
    }

    public static void main(String[] args) {
        Binary_Tree_Level_Order_Traversal b = new Binary_Tree_Level_Order_Traversal();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        b.levelOrder(root);
    }
}
