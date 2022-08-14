package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 
 * @Program Name: 移除元素_27
 * @Create : 2019/7/19
 * @Description :
 */
public class 移除元素_27 {

    public int removeElement(int[] nums, int val) {

        int temp = 0;
        for (int i = 0; i< nums.length ; i++){
            if (nums[i] != val){
                nums[temp] = nums[i];
                temp++;
            }
        }

       return temp;
    }

    public static void main(String[] args) {

        int[] a = new int[]{1 , 0 ,2, 2, 3, 4, 5, 0};
        int val  =2;

        移除元素_27 pp = new 移除元素_27();
        System.out.println(pp.removeElement(a, val));
    }
}
