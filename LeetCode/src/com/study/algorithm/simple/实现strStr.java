package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 实现strStr .java
 * @Create : 2019-02-24-12:49
 * @Description :这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * 第二种 自己的方法，，去实现indexof
 */
public class 实现strStr {

    /**
     * 在这个方法中，，如果匹配到合适的字符串，，返回-1
     * 如果 被匹配的字符串是空，则返回0
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0){
            return 0;
        }else {
            int num = haystack.indexOf(needle);

            return num;
        }
    }

    public static int[] getNext(String ps) {

        char[] p = ps.toCharArray();

        int[] next = new int[p.length];

        next[0] = -1;

        int j = 0;

        int k = -1;

        while (j < p.length - 1) {

            if (k == -1 || p[j] == p[k]) {

                if (p[++j] == p[++k]) { // 当两个字符相等时要跳过

                    next[j] = next[k];

                } else {

                    next[j] = k;

                }

            } else {

                k = next[k];

            }

        }

        return next;

    }
    /**
     * 练习kmp算法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack, String needle) {

        char[] h1 = haystack.toCharArray();
        char[] h2 = needle.toCharArray();

        int [] next = getNext(needle);

        //主串的位置
        int i = 0;

        //模式串的位置
        int j=0;

        while (i < h1.length && j < h2.length){
            if (j == -1 || h1[i] == h2[j]){
                i++;
                j++;
            }else {

                j = next[j];

            }
        }

        if ( j== h2.length){
            return i - j;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {

        实现strStr aa = new 实现strStr();
        String haystack = "hello", needle = "ll";
        System.out.println(aa.strStr1(haystack, needle));
    }
}
