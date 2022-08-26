package com.study.algorithm.simple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question121Test
 * @createTime 2022年08月23日 09:20:30
 * @Description TODO
 */
public class Question121Test {

    @Test
    public void maxProfit() {

        Question121 question121 = new Question121();

        int i = question121.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}