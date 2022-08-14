package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题_合并排序的数组
 * @Create : 2020/3/3
 * @Description :
 */
public class 面试题_合并排序的数组 {

    public void merge(int[] A, int m, int[] B, int n) {

        // 题目中已经假设 A 的末端有足够的空间进行存取，所以这里不需要去考虑空间不足的问题
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int a = 0;
        // 题目中给出，已经排序好，所以只需要合并就可以了
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                result[a] = A[i];
                i++;
                a++;
            } else if (A[i] > B[j]) {
                result[a] = B[j];
                j++;
                a++;
            } else {
                result[a] = A[i];
                i++;
                a++;
                result[a] = B[j];
                a++;
                j++;
            }
        }

        if (i < m) {
            for (int k = i; k < m; k++) {
                result[a] = A[k];
                a++;
            }
        }
        if (j < n) {
            for (int k = j; k < n; k++) {
                result[a] = B[k];
                a++;
            }
        }
        for (int p = 0; p < result.length; p++) {
            A[p] = result[p];
        }
    }


    public static void main(String[] args) {
        面试题_合并排序的数组 a = new 面试题_合并排序的数组();
        int[] n1 = new int[]{4,5,6,0,0,0};
        int[] n2 = new int[]{1,2,3};

        a.merge(n1, 3, n2, 3);
    }
}
