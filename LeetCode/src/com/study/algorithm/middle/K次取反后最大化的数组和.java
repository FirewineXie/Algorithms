package com.study.algorithm.middle;

import java.util.Arrays;
import java.util.Random;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: K次取反后最大化的数组和
 * @Create : 2020/2/19
 * @Description :
 */
public class K次取反后最大化的数组和 {


    public int largestSumAfterKNegations(int[] A, int K) {

        //虽然说是随机，但是，最后得到的答案是最大的数组之和
        //这是投机取巧的办法，
        //现将数组排序，将最小的那个取反，然后数组相加
        Arrays.sort(A);


        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && K > 0) {
                A[i] = -A[i];
                K--;
            }
        }
        Arrays.sort(A);
        if (K % 2 != 0) {
            A[0] = -A[0];
        }
        int result = 0;
        for (int index : A) {
            result += index;
        }
        return result;
    }



    public int largestSumAfterKNegations1(int[] A, int K) {

        //问题说，只能容许随机化，然后判断大小
        // 很明显，将数组排序，将最小的变化，是最快的，
        while (true) {
            //随机数字,大小为A
            int random = new Random().nextInt(A.length);
            //将数组的其中一个变为负数
            A[random] = -A[random];
            //进行数组相加
            int temp = 0;
            for (int i = 0; i < A.length; i++) {
                temp += A[i];
            }

//            if (count == key){
//                break;
//            }
        }
    }

    public static void main(String[] args) {

        K次取反后最大化的数组和 a = new K次取反后最大化的数组和();

        System.out.println(a.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));

    }
}
