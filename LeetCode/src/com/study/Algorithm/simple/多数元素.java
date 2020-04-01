package com.study.Algorithm.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 多数元素
 * @Create : 2020/3/13
 * @Description :
 */
public class 多数元素 {

    /**
     * 投机取巧法，
     * 花费过多内存，去排序，但是排序完，，时间就非常的快
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int tmp = nums[0];
        int count = 1;
        for (int i = 1 ; i< nums.length ; i++){

            if (tmp == nums[i]){
                count++;

                if (count > nums.length/2){
                  break;
                }
            }else {
                count = 1;
                tmp = nums[i];
            }
        }
        return tmp;
    }

    /**
     *  摩尔投票法思路
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i]) {
                ++count;
            } else {
                if (--count == 0) {
                    cand_num = nums[i];
                    count = 1;
                }
            }
        }
        return cand_num;
    }

    public static void main(String[] args) {
        多数元素 a =new  多数元素();

        System.out.println(a.majorityElement(new int[]{-1,1,1,1,2,1}));

    }
}
