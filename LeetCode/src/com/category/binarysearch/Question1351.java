package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1351
 * @createTime 2022年06月28日 09:33:52
 * @Description TODO
 */
public class Question1351 {

    public int countNegatives(int[][] grid) {

        int result = 0;
        for (int[] item : grid) {
            int l = 0;
            int r = item.length - 1;
            int pos = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (item[mid] < 0) {
                    pos = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (pos != -1) {
                result += item.length - pos;
            }
        }
        return result;

    }
}
