package com.study.algorithm.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题40_最小的k个数
 * @Create : 2020/3/20
 * @Description :
 */
public class 面试题40_最小的k个数 {

    public int[] getLeastNumbers(int[] arr, int k) {

        Arrays.sort(arr);

        int[] result = new int[k];

        for (int i = 0 ; i< k;i++){
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        面试题40_最小的k个数 a = new 面试题40_最小的k个数();


        a.getLeastNumbers(new int[]{4,5,1,6,2,7,3,8},4);
    }
}
