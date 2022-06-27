package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question34Test
 * @createTime 2022年06月27日 08:47:56
 * @Description TODO
 */
class Question34Test {

    @Test
    void searchRange() {
        Question34 question34 = new Question34();

        int[] ints = question34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        System.out.println(Arrays.toString(ints));

    }
}