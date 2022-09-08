package com.study;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName QuickSort
 * @createTime 2022年09月07日 16:16:42
 * @Description TODO
 */
public class QuickSort {

    public static void quickSort(int a[], int l, int r) {
        if (l >= r) {
            return;
        }
//选择第一个数为key
        int i = l;
        int j = r;
        int key = a[l];

        while (i < j) {
//从右向左找第一个小于key的值
            while (i < j && a[j] >= key) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }
//从左向右找第一个大于key的值
            while (i < j && a[i] < key) {
                i++;
            }

            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i - 1);//递归调用
        quickSort(a, i + 1, r);//递归调用
    }
}
