package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question35
 * @createTime 2022年06月22日 08:52:16
 * @Description TODO
 */
public class Question35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {

                left = mid + 1;
            }
        }
        return left;
    }
}
