package com.category.binarysearch;

import java.util.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question349
 * @createTime 2022年06月21日 09:40:05
 * @Description TODO
 */
public class Question349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        Set<Integer> temp  = new HashSet<>();
        if (length1 >= length2){
            for (int k : nums2) {

                for (int i : nums1) {
                    if (k == i) {
                        temp.add(k);
                    }
                }
            }
        }else {
            for (int k : nums1) {

                for (int i : nums2) {
                    if (k == i) {
                        temp.add(k);
                    }
                }
            }
        }
        int[] sum = new int[temp.size()];
        int i = 0;
        for (int a : temp){
            sum[i]  = a;
            i++;
        }
        return sum;
    }
}
