package com.sort.exam;

import static com.sort.until.Until.exch;
import static com.sort.until.Until.less;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 希尔排序 .java
 * @Create : 2019-02-23-18:17
 * @Description :
 */
public class 希尔排序 {

    public static void sort(Comparable[] a){
        int N = a.length;
        int h= 1;

        while (h < N/3){
            h = 3* h + 1;
        }
        while (h >=3){
            for (int i=h;i < N ; i++){
                for (int j =i; j>= h && less(a[i],a[j-h]); j -= h){
                    exch(a,j,j-h);
                }
                h = h/3;
            }
        }
    }
}
