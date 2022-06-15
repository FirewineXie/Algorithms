package com.category.tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question606
 * @createTime 2022年06月15日 11:25:18
 * @Description TODO
 */
public class Question606 {
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

    // 题目相当于 将 null 变成 （） ，，
    // 如果 右节点 不为null， 左节点 必须填补


    public String tree2str(TreeNode root) {

        String result = "" + root.val;
        result += dfs(root.left, root);
        result += dfs(root.right, root);
        return result;
    }

    /**
     * @param root 树根节点
     * @param pre  当前结点的前驱结点
     * @return
     */
    private String dfs(TreeNode root, TreeNode pre) {
        if (root == null) {
            if (pre.right != null && pre.left == null) {
                return "()";
            }
            return "";
        }

        String result = "(" + root.val +
                dfs(root.left, root);

        String rightT = dfs(root.right, root);
        if (!"".equals(rightT)) {
            result +=
                    rightT;

        }
        result += ")";

        return result;
    }
}
