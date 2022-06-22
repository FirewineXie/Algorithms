package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question852
 * @createTime 2022年06月22日 16:31:20
 * @Description TODO
 */
public class Question852 {

    public int peakIndexInMountainArray(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) {
                left = mid + 1;
                continue;
            }
            // 因为题目说，数组是满足山脉情况的，所以不考虑一些边界条件
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
