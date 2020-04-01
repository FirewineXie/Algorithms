package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 搜索插入位置 .java
 * @Create : 2019-02-24-13:36
 * @Description :
 */
public class 搜索插入位置 {

    public int searchInsert(int[] nums, int target) {

        if (nums[0] > target){
            return 0;
        }
        else if (nums[nums.length-1] <target){
            return nums.length;
        }else {
            for (int i=0; i< nums.length ; i++){
                if (target == nums[i]){
                    return i;
                }
                if (target > nums[i] && target < nums[i+1]){
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        搜索插入位置 aa = new 搜索插入位置();
        int[] a = new int[]{1,3,5,6} ;
        System.out.println(aa.searchInsert(a,7));

    }
}
