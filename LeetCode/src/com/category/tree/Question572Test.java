package com.category.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question572Test
 * @createTime 2022年06月14日 10:13:35
 * @Description TODO
 */
class Question572Test {

    @Test
    void isSubtree() {

        Question572 question572 = new Question572();

        Question572.TreeNode root = new Question572.TreeNode(1);
        //root.right = new Question572.TreeNode(5);
        root.left = new Question572.TreeNode(1);
        //root.left.left = new Question572.TreeNode(1);
        //root.left.right = new Question572.TreeNode(2);

        Question572.TreeNode subRoot = new Question572.TreeNode(1);
        //subRoot.left = new Question572.TreeNode(1);
        //subRoot.right = new Question572.TreeNode(2);

        System.out.println(question572.isSubtree(root, subRoot));
    }

}