package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 旋转数组
 * @Create : 2020/4/1
 * @Description :
 */
public class 旋转数组 {

    /**
     * 牺牲 空间，换时间
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }

    }

    public static void main(String[] args) {
        旋转数组 a = new 旋转数组();
        int[] bb = new int[]{1,2,3,4,5,6,7};
        a.rotate(bb, 3);


    }


}
