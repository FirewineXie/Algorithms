package com.category.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName QuestionLcp44
 * @createTime 2022年06月12日 15:42:56
 * @Description TODO
 */
public class QuestionLcp44 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int numColor(TreeNode root) {

        Map<Integer, Boolean> color = new HashMap<>();

        colorDfs(root, color);
        return color.size();
    }

    private TreeNode colorDfs(TreeNode root, Map<Integer, Boolean> color) {
        if (root == null) {
            return null;
        } else {
            color.put(root.val, true);

        }

        colorDfs(root.left, color);
        colorDfs(root.right, color);
        return root;
    }
}
