package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: x的平方根
 * @Create : 2020/3/1
 * @Description :
 */
public class x的平方根 {

    public int mySqrt(int x) {

        //采用二分查找// 数字就是1 到x 之间，如果x 的一半的平方大于x 那么选择前面一般
        // 类似
        int left = 2;
        int right = x / 2;
        long num;
        int pivot;
        if (x == 1) {
            return 1;
        }
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long) pivot * pivot;
            if (num > x) {
                right = pivot - 1;
            } else if (num < x) {
                left = pivot + 1;
            } else {
                return pivot;
            }


        }
        return right;
    }

    public static void main(String[] args) {
        x的平方根 a = new x的平方根();
        System.out.println(a.mySqrt(2147395599));
        System.out.println(Math.sqrt(1));
    }
}
