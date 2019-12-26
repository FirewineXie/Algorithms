package com.kyu6;
/*
 * Write a function, persistence,
 * that takes in a positive parameter num and returns
 * its multiplicative persistence, which is the number
 * of times you must multiply the digits in num until you reach a single digit.
 *
 */

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: item
 * @Create : 2019/10/31
 */
public class Persistent_Bugger {

    /**
     * 第一种方法： 把数字转化成字符串
     * @param n
     * @return
     */
    public static int persistence(long n) {

        //采用递归的方式比较好
        String temp = String.valueOf(n);
        int length = temp.length();
        long total  = 1;
        for (int i = 0; i < length; i++) {

            total *= Long.parseLong(String.valueOf(temp.charAt(i)));
        }




        return (total< 10) ? (int) total : persistence(total) ;
    }


    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        System.out.println(persistence(39));
    }

}

