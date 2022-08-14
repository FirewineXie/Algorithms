package com.category.tree;

import org.junit.jupiter.api.Test;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question606Test
 * @createTime 2022年06月15日 11:44:06
 * @Description TODO
 */
class Question606Test {

    @Test
    void tree2str() {
        Question606.TreeNode root = new Question606.TreeNode(1);
        root.right = new Question606.TreeNode(3);
        root.left = new Question606.TreeNode(2);
        root.left.left = new Question606.TreeNode(4);


        Question606 question606 = new Question606();


        System.out.println(question606.tree2str(root));
    }
}