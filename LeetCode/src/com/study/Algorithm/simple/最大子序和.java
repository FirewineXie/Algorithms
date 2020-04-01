package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 最大子序和
 * @Create : 2020/3/1
 * @Description : 题 53
 */
public class 最大子序和 {

    /**
     * 首先，有两种情况：
     * 1. 都是负值，那么最小的可能是单个负值最大的那个，就是和为最大的数组
     * 2. 里面正数，那么最不济的情况下，也是存在一个正数的最大连续数组，
     * 1. 那么有可能，存在 连续子数组的情况下，对吧，而得到最大连续子数组
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        // 和
        int sum = 0;
        int max = nums[0];

        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            max = Math.max(max, sum);
        }

//        System.out.println(max);
        return max;
    }

    /**
     *动态规划
     **/
    public int maxSubArray1(int[] nums) {
        int n = nums.length, maxSum = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        Solution a = new Solution();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(a.maxSubArray(nums));
    }
}

class Solution {
    public int crossSum(int[] nums, int left, int right, int p) {
        if (left == right) {
            return nums[left];
        }

        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = p; i > left - 1; --i) {
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for (int i = p + 1; i < right + 1; ++i) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum;
    }

    public int helper(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p + 1, right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    public int maxSubArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}

