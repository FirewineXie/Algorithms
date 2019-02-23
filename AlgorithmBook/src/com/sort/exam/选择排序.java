package com.sort.exam;


import java.util.concurrent.Callable;

import static com.sort.until.Until.exch;
import static com.sort.until.Until.less;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 选择排序 .java
 * @Create : 2019-02-23-16:47
 * @Description :
 */
public class 选择排序 {


    public static void sort(Comparable[] a){
        //将a 按升序排列
        int N = a.length;
        for (int i = 0; i< N; i++){
            //将a[i] 和 a[i+1,N]中最小的元素进行交换
            int min = i;
             for (int j= i+1; j< N; j++){
                 if (less(a[j],a[min])){
                     min = j;
                 }
                 exch(a,i,min);
             }
        }
    }
}
