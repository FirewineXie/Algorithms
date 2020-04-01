package com.study.Algorithm.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 数组拆分I .java
 * @Create : 2019-03-15-21:35
 * @Description :
 */
public class 数组拆分I {


    public int min(int a,int b){
        if (a <= b){
            return a;
        }else {
            return b;
        }
    }
    public int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i+=2){

            sum += min(nums[i],nums[i+1]);

        }
        return sum;
    }

    public static void main(String[] args) {


        数组拆分I aa = new 数组拆分I();
        int[] a = new int[]{1,4,3,2};
        System.out.println(aa.arrayPairSum(a));
    }


}
