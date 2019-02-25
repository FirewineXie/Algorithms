package com.sort.exam;

import edu.princeton.cs.algs4.StdRandom;

import static com.sort.until.Until.exch;
import static com.sort.until.Until.less;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 快速排序 .java
 * @Create : 2019-02-24-15:53
 * @Description :
 */
public class 快速排序 {

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);

        sort(a,0,a.length-1);
    }


    private static void sort(Comparable[] a, int lo,int hi){
        if (hi <= lo){
            return;
        }
        int j= partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo , j = hi+1;
        Comparable v = a[lo];
        while (true){
            while (less(a[++i],v)){
                if (i == hi){
                    break;
                }
            }
            while (less(v,a[--j])){
                if (j == lo){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

}
class Quick3way{
    private static void sort(Comparable[] a, int lo , int hi){

        if (hi <= lo){
            return;
        }
        int lt = lo,i=lo+1,gt = hi;
        Comparable v = a[lo];
        while (i <= gt){
            int cmp = a[i].compareTo(v);
            if (cmp <0){
                exch(a,lt++,i++);
            }else if (cmp > 0){
                exch(a,i,gt--);
            }else {
                i++;
            }
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
}

