package com.basic.training;


import edu.princeton.cs.algs4.StdIn;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: P5.java
 * @Create : 2019-02-14-15:25
 * @Description :  将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class P5 {


    public static void main(String[] args) {

        double x,y;
        x = StdIn.readDouble();
        y = StdIn.readDouble();

        if (compare(x) && compare(y)){
            System.out.println("true");
        }

    }

    private static boolean compare(double x) {

        if (x < 1){
            if ( x >0 ){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
}
