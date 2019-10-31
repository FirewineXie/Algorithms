package com.Chapter5.sort;

import edu.princeton.cs.algs4.Insertion;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 高位优先 .java
 * @Create : 2019-04-07-15:56
 * @Description :
 */
public class 高位优先  {

    //基数
    private static  int R = 256;

    // 小数组的切换阈值
    private  static final int M =15;

    //数据分类的辅助数组
    private static String[] aux;

    private static int charAt(String s,int d){
        if (d < s.length()){
            return s.charAt(d);

        }else {
            return -1;
        }
    }
    public static void sort(String[] a){
        int N = a.length;
        aux = new String [N];
        sort(a,0,N-1,0);
    }

    private static void sort(String[] a, int lo, int hi, int d) {

        if (hi <= lo + M){
            Insertion.sort(a,lo,hi,d);
            return;
        }
        //计算频率
        int[] count = new int[R+2];
        for (int i = lo;i <= hi ;i++){

            count[charAt(a[i],d)+ 2]++;
        }

        for (int r= 0; r <R+1; r++){
            count[r+1] += count[r];
        }

        for (int i= lo; i <= hi; i++){
            aux[count[charAt(a[i],d) + 1]++] = a[i];
        }

        for (int i= lo;i <= hi ;i++){
            a[i] =aux[i - lo];
        }


        for (int r= 0 ; r <R ; r++){
            sort(a,lo+count[r],lo+count[r+1] -1,d+1);
        }

    }



}
