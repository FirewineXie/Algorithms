package com.sort.exam;

import static com.sort.until.Until.exch;
import static com.sort.until.Until.less;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 插入排序 .java
 * @Create : 2019-02-23-17:09
 * @Description :
 */
public class 插入排序 {

    public static void sort1(Comparable[] a){
        //将a[] 按升序排序
        int N = a.length;
        for (int i=1; i < N;i++){
            //将a[i] 插入到a[i-1],a[i-2],a[i-3] ...之中
            for (int j = i; j >0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void sort2(Comparable[] a){
        //将a[] 按升序排序
        int N = a.length;

        for (int i=1; i < N;i++){
            //将a[i] 插入到a[i-1],a[i-2],a[i-3] ...之中
            Comparable temp = a[i];
            int j = i;
            for (; j>0 && less(temp,a[j-i]);j--){
                a[j] = a[j-1];
            }
            a[j] = temp;

        }
    }
}
