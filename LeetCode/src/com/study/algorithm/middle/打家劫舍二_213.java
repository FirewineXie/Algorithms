package com.study.algorithm.middle;



/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 打家劫舍二_213.java
 * @createTime: 2021年04月15日 09:01:21
 * @Description TODO
 */
public class 打家劫舍二_213 {


    public static void main(String[] args) {

        打家劫舍二_213 a = new 打家劫舍二_213();

        System.out.println(a.rob(new int[]{1,3,1,3,100}));

    }

    // 动态规划，首先找到 状态转移方程
    //dp[i]=max(dp[i−2]+nums[i],dp[i−1])
    // 其次找到  边界条件
    // dp[start]=nums[start] 只有一间房屋，则偷窃该房屋
    // dp[start+1] = max[nums[start],nums[start+1] )  只有两间房，选金额最大那个

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    public int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }


}
