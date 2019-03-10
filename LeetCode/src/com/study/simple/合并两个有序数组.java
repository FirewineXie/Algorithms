package com.study.simple;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 合并两个有序数组 .java
 * @Create : 2019-03-10-19:06
 * @Description :
 */
public class 合并两个有序数组 {

    public void merge1(int[] nums1, int m, int[] nums2, int n) {

       //先把数组到一起
        int j = 0;
        for (int i =m;i < nums1.length;i++){
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //是直接排序 还是先合成，，在排序
        // 如果是直接排序，外加插入，，会重复的改变后面的元素，，如果数组无线大，，导致，更加的繁琐
        // 先合成，再排序，
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            nums1[k--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
    public static void main(String[] args) {

        合并两个有序数组 aa = new 合并两个有序数组();

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        aa.merge(nums1,3,nums2,3);
    }
}
