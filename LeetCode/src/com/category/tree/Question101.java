package com.category.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question101
 * @createTime 2022年06月17日 10:45:42
 * @Description TODO
 */
public class Question101 {
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

        @Override
        public String toString() {
            return String.valueOf(this.val);
        }
    }

    // 进行中序遍历,

    private List<TreeNode> list;


    public boolean isSymmetric(TreeNode root) {


        return dfs(root, root);


    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {

            return true;
        }
        return left.val == right.val && dfs(left.left, right.right) && dfs(left.right, right.right);


    }
}
