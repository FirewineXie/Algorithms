package com.category.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question563
 * @createTime 2022年06月13日 09:36:36
 * @Description TODO
 */
public class Question563 {

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


    public int findTilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.abs(sum(root.left) - sum(root.right)) + findTilt(root.left) + findTilt(root.right);
    }

    public int sum(TreeNode root){
        if(root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }


}
