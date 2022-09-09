package com.item.bm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm26
 * @createTime 2022年09月09日 11:20:40
 * @Description TODO
 */
public class Bm26 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write code here

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        ArrayList<Integer> first = new ArrayList<>();
        first.add(root.val);
        result.add(first);
        while (queue.size() != 0) {

            ArrayList<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            while (true) {
                if (size == 0) {
                    result.add(tmp);
                    break;
                }
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                queue.add(node.left);
                queue.add(node.right);
                tmp.add(node.val);
            }
            result.add(tmp);

        }
        return result;
    }
}
