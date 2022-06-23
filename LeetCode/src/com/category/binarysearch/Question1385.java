package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1385
 * @createTime 2022年06月23日 19:46:39
 * @Description TODO
 */
public class Question1385 {


    // 笨办法
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        for (int j : arr1) {
            boolean isF = true;
            for (int k : arr2) {
                int abs = Math.abs(j - k);
                if (abs <= d) {
                    isF = false;
                    break;
                }
            }
            if (isF) {
                result++;
            }
        }
        return result;
    }
}
