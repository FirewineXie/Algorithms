package com.Chapter5.sort;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 低位优先 .java
 * @Create : 2019-04-07-15:50
 * @Description :
 */
public class 低位优先 {


    public static  void sort(String[] a, int w){
        //通过前w个字符将a[]排序
        int N = a.length;
        int R = 256;
        String[] aux =  new String[N];


        for (int d= w-1 ; d>= 0 ; d--){
            int [] count = new int[R+1];
            for (int i=0; i< N ; i++){
                count[a[i].charAt(d)+1]++;
            }
            for (int r=0; r<R;r++){
                count[r+1] += count[r];
            }
            for (int i=0; i< N; i++){
                aux[count[a[i].charAt(d)]++] = a[i];
            }
            for (int i=0; i<N;i ++){
                a[i] = aux[i];
            }
        }
    }
}
