package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question704
 * @createTime 2022年06月21日 08:39:23
 * @Description TODO
 */
public class Question704 {


    public int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }
}
