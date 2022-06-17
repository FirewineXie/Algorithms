package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question101Test
 * @createTime 2022年06月17日 10:51:12
 * @Description TODO
 */
class Question101Test {

    @Test
    void isSymmetric() {
        Question101 question101 = new Question101();

        Question101.TreeNode root = new Question101.TreeNode(1);

        root.left = new Question101.TreeNode(2);
        root.left.right = new Question101.TreeNode(3);
        root.right = new Question101.TreeNode(2);
        root.right.right = new Question101.TreeNode(3);

        question101.isSymmetric(root);

    }
}