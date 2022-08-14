package com.category.tree;

import org.junit.jupiter.api.Test;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question110Test
 * @createTime 2022年06月15日 14:17:21
 * @Description TODO
 */
class Question110Test {

    @Test
    void isBalanced() {

        Question110 question110 = new Question110();

        //Question110.TreeNode root = new Question110.TreeNode(1);
        //root.left = new Question110.TreeNode(2);
        //root.right = new Question110.TreeNode(2);
        //root.left.left = new Question110.TreeNode(3);
        //root.left.right = new Question110.TreeNode(3);
        //root.left.left.left = new Question110.TreeNode(4);
        //root.left.left.right = new Question110.TreeNode(4);

        Question110.TreeNode root = new Question110.TreeNode(3);
        root.left = new Question110.TreeNode(9);
        root.right = new Question110.TreeNode(20);
        root.right.left = new Question110.TreeNode(15);
        root.right.right = new Question110.TreeNode(7);
        System.out.println(question110.isBalanced(root));
    }
}