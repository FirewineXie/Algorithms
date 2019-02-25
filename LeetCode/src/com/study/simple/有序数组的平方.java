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


    /**
     * 尝试缩小一半的时间，去遍历数组
     * @param A
     * @return
     */
    public int[] sortedSquares1(int[] A) {
        int [] temp = new int[A.length];
        int N = A.length;

        int j= 0;

        while (j < N && A[j] < 0){
            j++;
        }
        int i = j-1;

        int t=0;
        while (i>=0 && j < N){
            if (A[i] *A[i] < A[j] * A[j]){
                temp[t++] = A[i] * A[i];
                i--;
            }else {
                temp[t++] = A[j] * A[j];
                j++;
            }
        }
        while (i >= 0) {
            temp[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            temp[t++] = A[j] * A[j];
            j++;
        }

        return temp;
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


