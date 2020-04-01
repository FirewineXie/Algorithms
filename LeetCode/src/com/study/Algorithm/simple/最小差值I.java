package com.study.Algorithm.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 最小差值I .java
 * @Create : 2019-03-03-17:03
 * @Description :
 */
public class 最小差值I {

    public int smallestRangeI(int[] A, int K) {

        Arrays.sort(A);
        int min_int = A[0];
        int max_int = A[A.length-1];


        if ((max_int - min_int) /2 >= K) {
            return (max_int - K) - (min_int + K);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

        最小差值I a = new 最小差值I();

        int[] q = new int[]{0,10};
        int k = 2;
        System.out.println(a.smallestRangeI(q,k));
    }
}
