package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question513Test
 * @createTime 2022年06月23日 19:57:54
 * @Description TODO
 */
class Question513Test {

    @Test
    void findBottomLeftValue() {
        Question513 question513 = new Question513();

        Question513.TreeNode root = new Question513.TreeNode(1);
        root.left = new Question513.TreeNode(2);
        root.left.left = new Question513.TreeNode(4);

        root.right = new Question513.TreeNode(3);
        root.right.left = new Question513.TreeNode(5);
        root.right.left.left = new Question513.TreeNode(7);
        root.right.right = new Question513.TreeNode(6);
        question513.findBottomLeftValue(root);
    }
}