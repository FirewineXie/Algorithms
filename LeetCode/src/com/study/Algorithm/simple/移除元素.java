package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： xyjworkgame@163.com
 * @Program Name: 移除元素
 * @Create : 2019/7/19
 * @Description :
 */
public class 移除元素 {

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

        移除元素 pp = new 移除元素();
        System.out.println(pp.removeElement(a, val));
    }
}
