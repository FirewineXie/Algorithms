package com.study.algorithm.middle;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 使数组唯一的最小增量
 * @Create : 2020/3/22
 * @Description :
 */
public class 使数组唯一的最小增量 {

    /**
     *   首先数组是有重复值，那么进行加一，让其不重复
     * @param A
     * @return
     */
    public int minIncrementForUnique(int[] A) {

        Arrays.sort(A);

        int move = 0;
        // 遍历数组，若当前元素小于等于它的前一个元素，则将其变为前一个数+1
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                int pre = A[i];
                A[i] = A[i - 1] + 1;
                move += A[i] - pre;
            }
        }
        return move;

    }
    public static void main(String[] args) {


        使数组唯一的最小增量 a = new 使数组唯一的最小增量();

        System.out.println(a.minIncrementForUnique(new int[]{3,2,1,2,1,7}));
        /*
            1 1 2 2 3 7
            1 4 2 5 3 7
         */

    }
}
