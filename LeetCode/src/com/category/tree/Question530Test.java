package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question530Test
 * @createTime 2022年06月12日 21:37:34
 * @Description TODO
 */
class Question530Test {

    @Test
    void getMinimumDifference() {

        Question530 question530 = new Question530();

        Question530.TreeNode root = new Question530.TreeNode(4);

        root.left = new Question530.TreeNode(2);
        root.right = new Question530.TreeNode(6);


        root.left.left = new Question530.TreeNode(1);
        root.left.right = new Question530.TreeNode(3);

        question530.getMinimumDifference(root);
    }
}