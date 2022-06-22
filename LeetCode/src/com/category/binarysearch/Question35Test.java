package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question35Test
 * @createTime 2022年06月22日 10:19:38
 * @Description TODO
 */
class Question35Test {

    @Test
    void searchInsert() {

        Question35 question35 = new Question35();

        int i = question35.searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(i);
    }
}