package com.category.tree;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question2236
 * @createTime 2022年06月12日 15:33:17
 * @Description TODO
 */
public class Question2236 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean checkTree(TreeNode root) {


        return root.val == (root.left.val + root.right.val);

    }


}
