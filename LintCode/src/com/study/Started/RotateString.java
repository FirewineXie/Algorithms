package com.study.Started;

/**
 * @version : 1.0
 * @auther : xie     xyjworkgame@163.com
 * @Program Name: <br>
 * @Create : 2018-10-10-23:22
 */
public class RotateString {

    public static void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0){
            return;
        }else  if (offset >= str.length){
            int cal = offset % str.length;

            for (int i = 0;i<cal;i++) {
                char temp = str[str.length - 1];
                for (int j = 1; j < str.length; ++j) {

                    str[str.length - j] = str[str.length - j - 1];
                }
                str[0] = temp;
            }
            for (char s : str) {
                System.out.print(s);
            }
        }else {

            for (int i = 0;i<offset;i++) {
                char temp = str[str.length - 1];
                for (int j = 1; j < str.length; ++j) {

                    str[str.length - j] = str[str.length - j - 1];
                }
                str[0] = temp;
            }
            for (char s : str) {
                System.out.print(s);
            }
        }
    }

    public static void main(String[] args) {
        char[] str = {'a','b','c','d','e','f','g'};


        RotateString.rotateString(str,0);
    }
}
