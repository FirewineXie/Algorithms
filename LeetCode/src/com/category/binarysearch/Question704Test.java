package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question704Test
 * @createTime 2022年06月21日 08:50:23
 * @Description TODO
 */
class Question704Test {

    @Test
    void search() {

        Question704 question704 = new Question704();
        question704.search(new int[]{-1,0,3,5,9,12},13);
    }
}