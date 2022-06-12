package com.category.tree;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question530
 * @createTime 2022年06月12日 18:35:06
 * @Description TODO
 */
public class Question530 {
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

    // 使用非递归，才能够更好的计算最小值

    int pre ;
    int min ;

    public int getMinimumDifference(TreeNode root) {

        min = Integer.MAX_VALUE;
        pre = -1;
        dfsTree(root);
        return min;
    }


    private void dfsTree(TreeNode root) {
        if (root == null) {
            return;
        }
        dfsTree(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            min = Math.min(min, root.val - pre);
            pre = root.val;
        }
        dfsTree(root.right);
    }
}
