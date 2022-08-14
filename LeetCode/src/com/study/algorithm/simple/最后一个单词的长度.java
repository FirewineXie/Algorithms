package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 最后一个单词的长度
 * @Create : 2020/3/1
 * @Description :
 */
public class 最后一个单词的长度 {

    public int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    continue;
                }else {
                    break;
                }
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        最后一个单词的长度 a = new 最后一个单词的长度();

        System.out.println(a.lengthOfLastWord("a "));
    }

}
