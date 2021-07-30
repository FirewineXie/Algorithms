package com.study.Started;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-15-22:53
 */
public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here

        //已经知道数组A和B已经是排序好的，所以，只需要合并数组

        //是归并排序，，所有你要了解啊

        int lena = A.length;
        int lenb = B.length;
        int[] c = new int[lena + lenb];
        int i = 0, j = 0, k = 0;//分别代表数组a ,b , c 的索引
        while (i < lena && j < lenb) {
            if (A[i] < B[j])
                c[k++] = A[i++];
            else
                c[k++] = B[j++];
        }
        while (i < lena)
            c[k++] = A[i++];
        while (j < lenb)
            c[k++] = B[j++];
        return c;
    }

    public static void main(String[] args) {
        int[] c = MergeSortedArray.mergeSortedArray(new int[] { 1, 2, 3, 4 }, new int[] { 0, 2, 4, 5,
                6, 7, 8 });
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i]+" ");
    }
}
