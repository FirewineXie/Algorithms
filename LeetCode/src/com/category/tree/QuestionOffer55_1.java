package com.category.tree;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName QuestionOffer55_1
 * @createTime 2022年06月16日 14:38:39
 * @Description 剑指 Offer 55 - I. 二叉树的深度
 */
public class QuestionOffer55_1 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }




    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }


        return  dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = dfs(root.left);
        int depthRight = dfs(root.right);
        return depthLeft > depthRight ? depthLeft + 1 : depthRight + 1;
    }


}
