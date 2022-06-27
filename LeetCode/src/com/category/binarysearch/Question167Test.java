package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question167Test
 * @createTime 2022年06月27日 09:54:46
 * @Description TODO
 */
class Question167Test {

    @Test
    void twoSum() {
        Question167 question167 = new Question167();

        int[] ints = question167.twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(ints));
    }
}