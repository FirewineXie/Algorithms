package com.study.Algorithm.simple;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题62_圆圈中最后剩下的数字
 * @Create : 2020/3/30
 * @Description :
 */
public class 面试题62_圆圈中最后剩下的数字 {

    /**
     *
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {

       return n == 1 ? 0 : (lastRemaining(n-1,m)+m) % n;
    }
    public int lastRemaining1(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

    public static void main(String[] args) {

        面试题62_圆圈中最后剩下的数字 a=new 面试题62_圆圈中最后剩下的数字();

        System.out.println(a.lastRemaining(5, 3));
    }
}
