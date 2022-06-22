package com.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question852Test
 * @createTime 2022年06月22日 16:39:59
 * @Description TODO
 */
class Question852Test {

    @Test
    void peakIndexInMountainArray() {
        Question852 question852 = new Question852();


        int i = question852.peakIndexInMountainArray(new int[]{3,5,3,2,0});
        System.out.println(i);
    }
}