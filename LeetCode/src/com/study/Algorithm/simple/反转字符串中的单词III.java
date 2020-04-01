package com.study.Algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 反转字符串中的单词III .java
 * @Create : 2019-03-11-17:56
 * @Description :
 */
public class 反转字符串中的单词III {


    public String reverseWords(String s) {

        String result ="";
//        int temp1 = s.indexOf(32);
//        s = s.substring(temp1+1);
//        System.out.println(s+temp1);
//        temp1 =s.indexOf(32);
//        s = s.substring(temp1+1);
//        System.out.println(s + temp1);

        if(s == null){
            return null;
        }
        char[] array = s.toCharArray();
        for(int i=0;i<array.length;){
            if(array[i] != ' '){
                int begin = i;
                while(i < array.length && array[i] != ' '){
                    i++;
                }
                int end = i - 1;
                while(begin < end){
                    char c = array[begin];
                    array[begin++] = array[end];
                    array[end--] = c;
                }
            }else{
                i++;
            }
        }
        return new String(array);
    }

    public String reverseWords1(String s) {
        if(s == null){
            return null;
        }
        char[] array = s.toCharArray();

        String result = "";
        List<Integer> num = new ArrayList<>();
        for (int i=0; i< array.length;i++){

            if (array[i] == ' '){
                num.add(i);
            }
        }
        //上面记录
       return null;
    }
    public static void main(String[] args) {
        反转字符串中的单词III aa = new 反转字符串中的单词III();

        String aa1 = "Let's take LeetCode contest";
        System.out.println(aa.reverseWords(aa1));
    }
}
