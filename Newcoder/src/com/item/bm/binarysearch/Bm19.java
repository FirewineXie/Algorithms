package com.item.bm.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm19
 * @createTime 2022年09月08日 14:25:23
 * @Description TODO
 */
public class Bm19 {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        if (n == 1) return 0;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l+r)/2;
            if (nums[mid] > nums[mid+1]){
                r = mid;
            }
            else l = mid + 1;
        }
        return l;
    }

}
