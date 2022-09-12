package com.item.bm.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm27
 * @createTime 2022年09月12日 09:04:18
 * @Description TODO
 */
public class Bm27 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }



        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(pRoot);

        while (!stack1.isEmpty() || !stack1.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();

            while (!stack1.isEmpty()) {
                TreeNode pop = stack1.pop();
                if (pop.left != null) {
                    stack2.push(pop.left);
                }
                if (pop.right != null) {
                    stack2.push(pop.right);
                }
                tmp.add(pop.val);
            }

            if (!tmp.isEmpty()) {
                result.add(tmp);
                tmp = new ArrayList<>();
            }

            while (!stack2.isEmpty()) {
                TreeNode pop = stack2.pop();
                if (pop.right != null) {
                    stack1.push(pop.right);
                }
                if (pop.left != null) {
                    stack1.push(pop.left);
                }
                tmp.add(pop.val);
            }
            if (!tmp.isEmpty()) {
                result.add(tmp);
                tmp = new ArrayList<>();
            }
        }
        return result;
    }
}
