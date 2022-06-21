package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question367
 * @createTime 2022年06月21日 09:51:08
 * @Description TODO
 */
public class Question367 {


    public boolean isPerfectSquare(int num) {

        int left = 0, right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
