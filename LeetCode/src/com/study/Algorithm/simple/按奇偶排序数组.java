package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 按奇偶排序数组 .java
 * @Create : 2019-03-03-16:45
 * @Description :
 */
public class 按奇偶排序数组 {

    public int[] sortArrayByParity(int[] A) {

        int temp[] = new int[A.length];

        //一个是从头到尾，一个是从尾到头，开始进行输入数组
        int i=0;
        int j=A.length-1;
        for (int k=0; k< A.length ; k++){

            if (A[k] % 2 == 0){
                temp[i] = A[k];
                i++;
            }else {
                temp[j] = A[k];
                j--;
            }
        }

        return temp;
    }


    public static void main(String[] args) {

        按奇偶排序数组 aa = new 按奇偶排序数组();


        int[] a = new int[]{3,1,2,4};

        int[] b = aa.sortArrayByParity(a);


        for (int c : b){
            System.out.printf("%s ",c);
        }


    }

}
