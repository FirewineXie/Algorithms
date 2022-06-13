package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question563Test
 * @createTime 2022年06月13日 10:19:14
 * @Description TODO
 */
class Question563Test {

    @Test
    void findTilt() {

        Question563 question530 = new Question563();

        Question563.TreeNode root = new Question563.TreeNode(4);

        root.left = new Question563.TreeNode(2);
        root.right = new Question563.TreeNode(9);


        root.left.left = new Question563.TreeNode(3);
        root.left.right = new Question563.TreeNode(5);

        root.right.right = new Question563.TreeNode(9);
        root.right.right.right = new Question563.TreeNode(7);

        question530.findTilt(root);
    }
}