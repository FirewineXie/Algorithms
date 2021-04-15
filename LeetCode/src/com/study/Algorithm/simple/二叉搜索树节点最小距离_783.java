package com.study.Algorithm.simple;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 二叉搜索树节点最小距离_783.java
 * @createTime: 2021年04月13日 08:39:45
 * @Description TODO
 */
public class 二叉搜索树节点最小距离_783 {
    int pre = -1;
    int ans = Integer.MAX_VALUE;

    public void dfs(TreeNode1 root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }


    public int minDiffInBST(TreeNode1 root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;



    }

    public static void main(String[] args) {
        二叉搜索树节点最小距离_783 a = new 二叉搜索树节点最小距离_783();
        TreeNode1 root = new TreeNode1(4, new TreeNode1(2, new TreeNode1(1),
                new TreeNode1(3)), new TreeNode1(6));
        a.minDiffInBST(root);
    }
}


class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
