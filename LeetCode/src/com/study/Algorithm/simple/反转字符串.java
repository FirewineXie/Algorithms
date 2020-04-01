package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 反转字符串 .java
 * @Create : 2019-03-07-21:11
 * @Description :
 */
public class 反转字符串 {


    public void reverseString(char[] s) {

        int legnth = s.length;

        if (legnth % 2 == 0){
            for (int i = 0 ; i< legnth/2 ; i++){
                if (s[i] != s[legnth-i-1]){
                    char temp = s[i];

                    s[i] = s[legnth-i-1];
                    s[legnth-i-1] = temp;
                }
            }
        }else {
            for (int i =0 ; i < (legnth-1)/2;i++){
                if (s[i] != s[legnth-i-1]){
                    char temp = s[i];

                    s[i] = s[legnth-i-1];
                    s[legnth-i-1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        char[] a = new char[]{'h','e','l','l','o'};

        反转字符串 aa = new 反转字符串();

        aa.reverseString(a);

    }
}
