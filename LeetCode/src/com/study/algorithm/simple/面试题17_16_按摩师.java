package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题17_16_按摩师
 * @Create : 2020/3/24
 * @Description :
 */
public class 面试题17_16_按摩师 {


    /**
     *  1. 不能接受相邻预约
     *  2. 求的是总预约时间最长
     * @param nums
     * @return
     */
    public int massage(int[] nums) {

        // 那么就需要判断 i+2 ，和i+3 那个最大
        // 其次是不可能出现其他的情况
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        面试题17_16_按摩师 a = new 面试题17_16_按摩师();

        System.out.println(a.massage(new int[]{2,1,4,5,3,1,1,3}));
    }

}
