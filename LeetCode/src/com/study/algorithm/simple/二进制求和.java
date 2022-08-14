package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 二进制求和
 * @Create : 2020/3/1
 * @Description :
 */
public class 二进制求和 {

    public String addBinary(String a, String b) {

        // 1  1 为 0  进1
        // 1 0  为 1  不进
        int n = a.length(), m = b.length();
        if (n < m) {
            return addBinary(b, a);
        }
        int L = Math.max(n, m);

        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        for(int i = L - 1; i > -1; --i) {
            if (a.charAt(i) == '1') {
                ++carry;
            }
            if (j > -1 && b.charAt(j--) == '1') {
                ++carry;
            }

            if (carry % 2 == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }

            carry /= 2;
        }
        if (carry == 1) {
            sb.append('1');
        }
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        二进制求和 a = new 二进制求和();
        System.out.println(a.addBinary("11", "1"));
    }
}
