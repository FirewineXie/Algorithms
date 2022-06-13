package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question543Test
 * @createTime 2022年06月13日 09:13:29
 * @Description TODO
 */
class Question543Test {

    @Test
    void diameterOfBinaryTree() {

        Question543 question530 = new Question543();

        Question543.TreeNode root = new Question543.TreeNode(4);

        root.left = new Question543.TreeNode(2);
        root.right = new Question543.TreeNode(6);


        root.left.left = new Question543.TreeNode(1);
        root.left.right = new Question543.TreeNode(3);

        question530.diameterOfBinaryTree(root);
    }
}