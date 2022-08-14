package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 回文数.java
 * @Create : 2019-02-17-14:09
 * @Description :  判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 *
 * 进阶 ： 你能不将整数转为字符串来解决这个问题吗？
 */
public class 回文数 {

    public boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }else if (x > 0){

            // 使用字符串 尝试
            String s = String.valueOf(x);

            char[] array = s.toCharArray();
            String reverse = "";
            for (int i = array.length - 1; i >= 0; i--) {
                reverse += array[i];
            }

            if (s.equals(reverse)){
                return true;
            }else {
                return false;
            }
        }else {
            return true;
        }
    }

    /**
     * 反转的一把的数字
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if (x < 0 || (( x % 10) == 0)){
            return false;
        }else if (x >= 0){
            int revertedNumber = 0;
            while (x > revertedNumber){
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }
            return x == revertedNumber || x == revertedNumber/10;
        }
      return false;
    }

    public static void main(String[] args) {

        回文数 aa = new 回文数();

        System.out.println(aa.isPalindrome1(1221));

    }
}
