package my;

import my.util.TreeNode;

/**
 * Created by dean on 16/10/7.
 */
public class Sum_of_left_leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) return 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                sum += root.left.val;
            sum += sumOfLeftLeaves(root.left);
        }
        if (root.right != null){
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
