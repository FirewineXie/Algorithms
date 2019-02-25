package com.sort.exam;

import static com.sort.until.Until.less;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 归并排序 .java
 * @Create : 2019-02-24-14:27
 * @Description :
 */
public class 归并排序 {


}

/**
 * 自顶向下的归并排序
 */
class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo < hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge1(a, lo, mid, hi);
    }


    public static void merge1(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i < mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[i++];
            }
        }

    }
}

/**
 * 自底向上 的归并排序
 */
class MergeBU {

    private static Comparable[] aux;
    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];

        for (int sz = 1; sz < N;sz = sz+sz){
            for (int i =0; i < N-sz; i += sz+sz){
                merge2(a,i,i+sz-1,Math.min(i+sz+sz-1,N-1));
            }
        }
    }
    public static void merge2(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i < mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[i++];
            }
        }

    }
}