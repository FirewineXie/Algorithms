package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 按奇偶排序数组II .java
 * @Create : 2019-03-04-8:34
 * @Description :
 */
public class 按奇偶排序数组II {
    public int[] sortArrayByParityII(int[] A) {


        int[] temp = new int[A.length];
        //还是想尝试下 双指针的做法，，
        int i=0;

        int j=1;
        for (int k=0; k < A.length ;k++){

            if (A[k] % 2 == 0){
                System.out.println("fd"+A[k]);
                temp[i] = A[k];
                i += 2;
            }else {
                System.out.println("fs"+A[k]);
                temp[j] = A[k];
                j += 2;
            }
        }

        A=  temp;
        return A;
    }

    public static void main(String[] args) {
        按奇偶排序数组II aa = new 按奇偶排序数组II();


        int[] a = new int[]{
                4,2,5,7
        };

        int[] c = aa.sortArrayByParityII(a);

        for (int i= 0; i< c.length ;i ++){
            System.out.printf("%s " , c[i]);
        }
    }
}
