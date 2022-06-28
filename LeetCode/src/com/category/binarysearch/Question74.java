package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question74
 * @createTime 2022年06月28日 09:42:43
 * @Description TODO
 */
public class Question74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int[] m : matrix) {
            if (m[m.length - 1] < target) {
                continue;
            }
            if (m[0] > target) {
                continue;
            }
            int left = 0, right = m.length-1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (m[mid] == target) {
                    return true;
                } else if (m[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
        }
        return false;
    }
}
