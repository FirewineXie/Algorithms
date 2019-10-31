package com.Chapter5.sort;



/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 键索引计数法 .java
 * @Create : 2019-04-07-14:20
 * @Description :
 */
public class 键索引计数法 {


    public void sort(Str[] a ,int R ){

        int N  = a.length;

        Str[] aux = new Str[N];
        int[]  count = new int[R+1];


        //计算出现频率
        for (int i =0 ; i< N ;i++){
            count[a[i].key() +1]++;
        }

        //将频率转换为索引
        for (int r = 0; r < R; r++){
            count[r+1 ]+= count[r];
        }

        //将元素分类
        for (int i=0; i < N; i++){
            aux[count[a[i].key()]++] = a[i];
        }

        //回写
        for (int i=0; i < N; i++){
            a[i] = aux[i];
        }
    }
    public static void main(String[] args) {


    }


}
class Str {
    private String name;
    private int key;

    public Str(String name, int key) {
        super();
        this.name = name;
        this.key = key;
    }

    public int key() {
        return key;
    }

    @Override
    public String toString() {
        return name + ":" + key;
    }
}
