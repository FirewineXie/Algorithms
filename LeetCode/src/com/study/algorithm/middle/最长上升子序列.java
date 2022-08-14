package com.study.algorithm.middle;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 最长上升子序列
 * @Create : 2020/3/14
 * @Description :
 */
public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, 1);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
