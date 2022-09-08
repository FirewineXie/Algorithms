package com.item.bm.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm18
 * @createTime 2022年09月08日 14:05:06
 * @Description TODO
 */
public class Bm18 {


    public boolean Find(int target, int[][] array) {


        int left = array.length - 1;
        int right = 0;
        while (right >= 0 && left >= 0 &&left < array.length && right < array[0].length) {

            if (array[left][right] < target) {
                right++;
            } else if (array[left][right] > target) {
                left--;
            } else {
                return true;
            }
        }
        return false;
    }

}
