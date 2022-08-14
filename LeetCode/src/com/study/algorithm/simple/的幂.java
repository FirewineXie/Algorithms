package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 的幂 .java
 * @Create : 2019-03-06-17:25
 * @Description :
 */
public class 的幂 {

    /**
     * 1162261467是3的19次幂，是整数范围内最大的3的幂次
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467%n == 0;
    }

    public static void main(String[] args) {


        的幂 a = new 的幂();

        System.out.println(a.isPowerOfThree(243));



    }

}
