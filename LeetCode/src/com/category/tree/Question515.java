package com.category.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question515
 * @createTime 2022年06月24日 16:29:27
 * @Description TODO
 */
public class Question515 {

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

    public List<Integer> largestValues(TreeNode root) {


        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (queue.size() != 0) {

            int length = queue.size();
            int max = Integer.MIN_VALUE;
            boolean judge = false;

            for (int i = 0; i < length; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                if (poll.val >= max) {
                    judge = true;
                    max = poll.val;
                }

                queue.add(poll.left);
                queue.add(poll.right);
            }
            if (judge){
                result.add(max);
            }



        }
        return result;
    }

}
