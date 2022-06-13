package com.category.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question543
 * @createTime 2022年06月13日 08:48:12
 * @Description TODO
 */
public class Question543 {

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

    //
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {

        ans = 1;
        dfsTree(root);


        return ans - 1;

    }


    private int dfsTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = dfsTree(root.left);
        int depthRight = dfsTree(root.right);
        ans = Math.max(ans, depthLeft + depthRight + 1);
        return Math.max(depthLeft, depthRight) + 1;
    }
}
