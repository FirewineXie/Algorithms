package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 验证回文串
 * @Create : 2020/3/9
 * @Description :
 */
public class 验证回文串 {


    public boolean isPalindrome(String s) {

        if (s == "") {
            return true;
        }
        if (s == null){
            return false;
        }

        String tmp = s.toLowerCase();

        tmp = tmp.replace(" ", "");



        int i = 0;
        int j = tmp.length() - 1;

        while (i !=j) {


            if (Character.isLetterOrDigit(tmp.charAt(i))) {

                if (Character.isLetterOrDigit(tmp.charAt(j))) {
                    if (tmp.charAt(i) != tmp.charAt(j)) {
                        return false;
                    }else {

                        i++;
                        j--;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        验证回文串 a = new 验证回文串();

        System.out.println(a.isPalindrome(""));
    }
}
