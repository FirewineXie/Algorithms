package com.category.binarysearch;



/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question441
 * @createTime 2022年06月27日 09:10:16
 * @Description TODO
 */
public class Question441 {

    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }


}
