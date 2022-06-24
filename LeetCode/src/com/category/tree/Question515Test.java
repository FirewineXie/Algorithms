package com.category.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question515Test
 * @createTime 2022年06月24日 16:34:37
 * @Description TODO
 */
class Question515Test {

    @Test
    void largestValues() {

        Question515 question515 = new Question515();

        Question515.TreeNode root = new Question515.TreeNode(-2147483648);
        //root.left = new Question515.TreeNode(3);
        //root.right = new Question515.TreeNode(2);
        //root.left.left = new Question515.TreeNode(5);
        //root.left.right = new Question515.TreeNode(3);
        //root.right.right = new Question515.TreeNode(9);
        List<Integer> integers = question515.largestValues(root);
        for (int k : integers) {
            System.out.println(k);
        }
    }
}