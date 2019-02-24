package com.study.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 有序数组的平方.java
 * @Create : 2019-02-24-22:11
 * @Description :给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */
public class 有序数组的平方 {

    public static void sort(int[] a){
        if (a.length>0) {
            sort(a,0,a.length-1);
        }

    }
    public static void sort(int[] a,int low,int height){
        int i=low;
        int j=height;
        if (i>j) {    //放在k之前，防止下标越界
            return;
        }
        int k=a[i];

        while (i<j) {
            while (i<j&&a[j]>k) {    //找出小的数
                j--;
            }
            while (i<j&&a[i]<=k) {  //找出大的数
                i++;
            }
            if(i<j){   //交换
                int swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }

        }
        //交换K
        k=a[i];
        a[i]=a[low];
        a[low]=k;

        //对左边进行排序,递归算法
        sort(a, 0, i-1);
        //对右边进行排序
        sort(a,i+1,height);
    }

    public int[] sortedSquares1(int[] A) {

        for (int i=0; i<A.length;i++){

            A[i] =  A[i] * A[i];
        }

       sort(A);
        return A;
    }
    public int[] sortedSquares(int[] A) {

        for (int i=0; i<A.length;i++){
            double a = Math.pow(A[i],2);
            A[i] = (int) a;
        }

        for (int i=0; i < A.length ;i++){
            for (int j = 0; j < A.length -1 -i;j++){
                if (A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {

        有序数组的平方 aa = new 有序数组的平方();
        int[] a = new int[]{-4, -1, 0, 3, 10};

        int[] aaa = aa.sortedSquares(a);

        for (int i : aaa) {
            System.out.printf("%s ", i);
        }
    }
}


