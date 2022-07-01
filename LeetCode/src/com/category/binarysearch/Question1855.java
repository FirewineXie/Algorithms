package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1855
 * @createTime 2022年07月01日 08:44:21
 * @Description TODO
 */
public class Question1855 {

    public int maxDistance(int[] nums1, int[] nums2) {

        int ans = 0;
        for (int i = nums2.length - 1; i > 0; i--) {

            int left = 0, right = nums1.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums1[mid] > nums2[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                    if (i - mid > 0 && ans < (i - mid)) {
                        ans = i - mid;
                    }
                }
            }
        }
        return ans;
    }
}
