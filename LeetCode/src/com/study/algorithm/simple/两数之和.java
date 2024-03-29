package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 两数之和.java
 * @Create : 2019-02-17-13:00
 * @Description :
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class 两数之和 {


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0 ; i < nums.length-1; i++){

            for (int j = i+1 ; j < nums.length; j++){
                    if ((nums[i] + nums[j]) == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        return null;
    }


    public static void main(String[] args) {

        两数之和 aa = new 两数之和();
        int[]  nums = new int[]{2,2,3,4,5};

        int[] cc = aa.twoSum(nums,5);
        if (cc != null){
            System.out.println(cc[0]+"  " + cc[1]);
        }
    }


}
