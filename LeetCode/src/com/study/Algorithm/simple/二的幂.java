package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 二的幂
 * @Create : 2020/3/22
 * @Description :
 */
public class 二的幂 {

    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        二的幂 a = new 二的幂();

        System.out.println(a.isPowerOfTwo(16));

    }
}
