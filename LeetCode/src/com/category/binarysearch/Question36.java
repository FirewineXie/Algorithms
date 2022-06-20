package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question36
 * @createTime 2022年06月20日 09:33:08
 * @Description TODO
 */
public class Question36 {


    public int searchInsert(int[] nums, int target) {


        int left = 0;
        int right = nums.length;


        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (right == mid) {
                    right--;
                } else {
                    right = mid;
                }

            } else {
                if (left == mid) {
                    left++;
                } else {
                    left = mid;
                }

            }
        }

        return left ;
    }
}
