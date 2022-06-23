package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1385Test
 * @createTime 2022年06月23日 19:53:13
 * @Description TODO
 */
class Question1385Test {

    @Test
    void findTheDistanceValue() {
        Question1385 question1385 = new Question1385();


        question1385.findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3);
    }
}