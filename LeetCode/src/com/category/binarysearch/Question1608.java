package com.category.binarysearch;

import java.util.Arrays;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1608
 * @createTime 2022年06月27日 10:09:35
 * @Description TODO
 */
public class Question1608 {
    public int specialArray(int[] nums) {
        int left=1;
        int right=nums.length;
        while (left<=right){
            int mid=(left+right)/2;
            int count=getCount(nums,mid);
            if(count==mid) {
                return mid;
            }
            if(count<mid){
                right=mid-1;
            }else {
                left=mid+1;
            }

        }
        return -1;
    }

    private static int getCount(int[] nums, int mid) {
        int t=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=mid) {
                t++;
            }
        }
        return t;
    }

}
