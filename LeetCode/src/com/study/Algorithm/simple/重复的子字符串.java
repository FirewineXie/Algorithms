package com.study.Algorithm.simple;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: 重复的子字符串
 * @Create : 2020/2/28
 * @Description :
 */
public class 重复的子字符串 {

    /**
     * 使用队列
     *
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {

        char[] item = new char[s.length()];
        char[] chars = s.toCharArray();



        return false;
    }

    public static void main(String[] args) {
        重复的子字符串 da = new 重复的子字符串();

        System.out.println(da.repeatedSubstringPattern("ababab"));

    }
}
