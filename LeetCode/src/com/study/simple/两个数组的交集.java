package com.study.simple;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 两个数组的交集 .java
 * @Create : 2019-03-08-10:08
 * @Description :
 */
public class 两个数组的交集 {


    public int[] intersection(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        Set<Integer> temp  = new HashSet<>();
        if (length1 >= length2){
            for (int i = 0 ; i< length2;i++){

                for (int j =0;j < length1 ;j++){
                    if (nums2[i] == nums1[j]){
                        temp.add(nums2[i]);
                    }
                }
            }
        }else {
            for (int i = 0 ; i< length1;i++){

                for (int j =0;j < length2 ;j++){
                    if (nums1[i] == nums2[j]){
                        temp.add(nums1[i]);
                    }
                }
            }
        }
        int[] sum = new int[temp.size()];
        int i = 0;
        for (int a : temp){
            sum[i]  = a;
            i++;
        }
        return sum;
    }


    public static void main(String[] args) {

        两个数组的交集 aa = new  两个数组的交集();

        int[] num1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};
        System.out.println(aa.intersection(num1, num2));
    }
}
