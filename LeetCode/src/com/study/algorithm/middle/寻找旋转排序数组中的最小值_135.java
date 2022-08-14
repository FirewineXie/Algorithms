package com.study.algorithm.middle;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 寻找旋转排序数组中的最小值_135.java
 * @createTime: 2021年04月08日 09:06:22
 * @Description TODO
 */
public class 寻找旋转排序数组中的最小值_135 {


    public static void main(String[] args) {

        int[] test = new int[]{3, 4, 5, 0, 1, 2};

        寻找旋转排序数组中的最小值_135 a = new 寻找旋转排序数组中的最小值_135();
        System.out.println(a.findMin(test));
    }


    /**
     * 采用二分搜索
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] < nums[high]) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return nums[low];
    }
}
