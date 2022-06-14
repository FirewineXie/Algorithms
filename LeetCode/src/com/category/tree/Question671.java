package com.category.tree;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question671
 * @createTime 2022年06月14日 11:00:47
 * @Description TODO
 */
public class Question671 {

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

    int ans;
    int rootValue;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootValue = root.val;
        dfs(root);
        return ans;

    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (ans != -1 && root.val >= ans) {
            return;
        }
        if (root.val > rootValue) {
            ans = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
