package com.category.tree;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question110
 * @createTime 2022年06月15日 14:12:11
 * @Description TODO
 */
public class Question110 {

    static class TreeNode {
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

    public boolean isBalanced(TreeNode root) {


        return dfsDepth(root) >= 0;
    }

    private int dfsDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfsDepth(root.left);
        int right = dfsDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }

    }
}
