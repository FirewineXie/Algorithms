package com.category.binarysearch;

import com.study.Algorithm.simple.卡牌分组;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question36Test
 * @createTime 2022年06月20日 10:15:02
 * @Description TODO
 */
class Question36Test {

    @Test
    void searchInsert() {

        Question36 question36 = new Question36();

        int[] nums = new int[]{1, 3, 5, 6};
        int i = question36.searchInsert(nums, 0);
        System.out.println(i);
    }
}