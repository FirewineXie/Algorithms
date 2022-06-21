package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question374
 * @createTime 2022年06月21日 09:01:12
 * @Description TODO
 */

interface GuessGame {
    int guess(int num);
}
public class Question374 implements GuessGame{


    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (guess(mid) <= 0) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    @Override
    public int guess(int num) {
        return 0;
    }
}
