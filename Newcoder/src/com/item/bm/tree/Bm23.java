package com.item.bm.tree;


import java.util.ArrayList;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm23
 * @createTime 2022年09月09日 11:10:29
 * @Description TODO
 */
public class Bm23 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int[] preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        dfs(root, result);

        int[] s = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            s[i] = result.get(i);
        }
        return s;
    }

    private void dfs(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        dfs(root.left, result);
        dfs(root.right, result);


    }
}
