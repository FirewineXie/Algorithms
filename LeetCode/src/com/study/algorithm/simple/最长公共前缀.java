package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 最长公共前缀.java
 * @Create : 2019-02-17-14:33
 * @Description :编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class 最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {


        最长公共前缀 aa = new 最长公共前缀();

        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(aa.longestCommonPrefix(strings));
    }
}
