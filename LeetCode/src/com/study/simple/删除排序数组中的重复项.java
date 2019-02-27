package com.study.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 删除排序数组中的重复项 .java
 * @Create : 2019-02-23-19:35
 * @Description :
 */
public class 删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }

    public int removeDuplicates2(int[] nums) {
        Set<Integer> integers = new HashSet<>();


        for (int i=0;i <nums.length;i++){
            integers.add(nums[i]);
        }

        return integers.size();

    }

    public static void main(String[] args) {


        删除排序数组中的重复项 aa = new 删除排序数组中的重复项();
        int []nums =new int[]{1,1,2};
        int[] temp = nums;
        for (int i =0; i< nums.length;i++){
            System.out.printf("%s ",nums[i]);

        }
        int a = aa.removeDuplicates(nums);
        System.out.println();
        for (int i=0; i< a;i++){
            System.out.printf("%s  ",nums[i]);
        }

        System.out.println();
        for (int i =0; i< temp.length;i++){
            System.out.printf("%s ",temp[i]);

        }
        System.out.println();
        System.out.println(a);

        System.out.println();
        System.out.println(aa.removeDuplicates2(nums));
    }
}
