package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 字符串的最大公因子
 * @Create : 2020/3/12
 * @Description :
 */
public class 字符串的最大公因子 {

    public String gcdOfStrings(String str1, String str2) {

        // 最后返回的字符串是 str1，str2 的公因子，是多次拼接后的，

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        //辗转相除法求gcd
        return str1.substring(0,gcd(str1.length(),str2.length()));



    }
    private int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }


    public static void main(String[] args) {
        字符串的最大公因子 a = new 字符串的最大公因子();

        a.gcdOfStrings("ABCABC", "ABC");
    }

}
