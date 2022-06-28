package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question74Test
 * @createTime 2022年06月28日 09:47:03
 * @Description TODO
 */
class Question74Test {

    @Test
    void searchMatrix() {
        Question74 question74 = new Question74();

        question74.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},13);
    }
}