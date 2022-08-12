package com.study.Algorithm.simple;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1417
 * @createTime 2022年08月11日 20:13:33
 * @Description TODO
 */
public class Question1417 {

    public String reformat(String s) {

        int sumDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sumDigit++;
            }
        }
        int sumAlpha = s.length() - sumDigit;
        if (Math.abs(sumDigit - sumAlpha) > 1){
            return "";
        }
        boolean flag = sumDigit > sumAlpha;
        char[] chars = s.toCharArray();
        for (int i = 0,j=1; i < s.length(); i+=2) {
            if (Character.isDigit(chars[i]) != flag){
                while (Character.isDigit(chars[j]) != flag) {
                    j += 2;
                }
                swap(chars, i, j);

            }
        }
        return new String(chars);
    }
    public void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

}
