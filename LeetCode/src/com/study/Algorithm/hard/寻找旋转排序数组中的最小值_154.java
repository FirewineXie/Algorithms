package com.study.Algorithm.hard;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 寻找旋转排序数组中的最小值_154.java
 * @createTime: 2021年04月09日 09:57:45
 * @Description TODO
 */
public class 寻找旋转排序数组中的最小值_154 {


    public int findMin(int[] nums) {

        int min = 0;
        int high = nums.length - 1;
        while (min < high){
            int middle = min + (high - min)/2;
            if (nums[middle] < nums[high]){
                    high--;
            }else if(nums[middle] > nums[high]){
                min ++;
            }else{
                high--;
            }

        }
        return nums[min];
    }

    public static void main(String[] args) {

    }
}
