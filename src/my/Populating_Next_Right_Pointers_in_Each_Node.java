package my;

/**
 * Created by dean on 16/10/26.
 */

import apple.laf.JRSUIUtils;
import my.util.TreeLinkNode;

import javax.print.attribute.HashDocAttributeSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Populating_Next_Right_Pointers_in_Each_Node {
    public void connect(TreeLinkNode root) {
        fun(root,1,new HashMap<Integer, TreeLinkNode>());
    }
    public void fun(TreeLinkNode root, int level, Map<Integer,TreeLinkNode> map){
        if (root != null){
            if (map.containsKey(level)){
                map.get(level).next = root;
            }
            map.put(level,root);
            fun(root.left,level + 1,map);
            fun(root.right,level + 1,map);
        }
    }
}
