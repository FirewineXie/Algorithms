package com.study;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName BubbleSort
 * @createTime 2022年09月07日 13:59:37
 * @Description TODO
 */
public class BubbleSort {

    public static void BubbleSort(int[] arr) {
        int temp;//临时变量

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[i - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void BubbleSort1(int [] arr){

        int temp;//临时变量
        boolean flag;//是否交换的标志
        for(int i=0; i<arr.length-1; i++){   //表示趟数，一共 arr.length-1 次

            // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            flag = false;

            for(int j=arr.length-1; j>i; j--){ //选出该趟排序的最大值往后移动

                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;    //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if(!flag) {
                break;
            }
        }
    }
}
