package com.category.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question513
 * @createTime 2022年06月22日 16:48:56
 * @Description TODO
 */
public class Question513 {
    class TreeNode {
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

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode ans = null;

        queue.add(root);
        int depth = 1;
        while (queue.size() != 0) {


            for (int i = 0; i < queue.size(); i++) {
                TreeNode poll = queue.poll();
                if (i == 0) {
                    ans = poll;
                }
                queue.add(poll.left);
                queue.add(poll.right);
                depth++;
            }
        }
        return ans.val;
    }

}
