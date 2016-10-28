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
public class Sum_Root_to_Leaf_Numbers {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        fun(new ArrayList<String>(),root);
        return sum;
    }
    public void fun(List<String> temp, TreeNode root){
        if (root != null){
            temp.add(root.val+"");
            if ((root.left == null && root.right == null)){
                String str = "";
                for (int i = 0;i < temp.size(); ++i){
                    str+=temp.get(i);
                }
                sum += Integer.parseInt(str);
            }
            fun(temp,root.left);
            fun(temp,root.right);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.substring(0,str.length() - 1));
    }
}
