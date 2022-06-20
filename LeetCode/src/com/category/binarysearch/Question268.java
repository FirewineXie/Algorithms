package com.category.binarysearch;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question268
 * @createTime 2022年06月20日 11:29:35
 * @Description TODO
 */
public class Question268 {

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;


    }

}
