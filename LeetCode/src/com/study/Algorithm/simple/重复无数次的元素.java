package com.study.Algorithm.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 重复无数次的元素 .java
 * @Create : 2019-02-28-17:26
 * @Description :  在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 返回重复了 N 次的那个元素
 */
public class 重复无数次的元素 {


    public int repeatedNTimes(int[] A) {

        Arrays.sort(A);

        int a = A.length;

        return  A[a/2] == A[A.length-1]?A[A.length/2]:A[A.length/2 -1];


    }

    public static void main(String[] args) {
        重复无数次的元素 aa = new 重复无数次的元素();

        int[] aaa = new int[]{
                1, 2, 3, 3
        };
        System.out.println(aa.repeatedNTimes(aaa));
    }

}
