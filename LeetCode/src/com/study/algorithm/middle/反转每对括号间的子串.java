package com.study.algorithm.middle;

import java.util.Stack;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: 反转每对括号间的子串
 * @Create : 2020/2/28
 * @Description :
 * <p>
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * <p>
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * <p>
 * 注意，您的结果中 不应 包含任何括号。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 反转每对括号间的子串 {


    /*
       题的意思是逐层反转，，
       当遇到括号是，改变反转，，，当遇到) ,反转完成
     */

    public String reverseParentheses(String s) {


        Stack<Integer> stack = new Stack<>();

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i< s.length() ;i++){
            if (chars[i] =='('){
                stack.push(i);
            }
            if (chars[i] == ')'){
                revere(chars,stack.pop()+1,i-1);
            }
        }
        for (int i = 0 ;i < chars.length ;i++){
            if (chars[i] !='(' && chars[i] != ')'){
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 反转字符数组
     * @param chars
     * @param pop
     * @param length
     */
    private void revere(char[] chars, Integer pop, int length) {

        while (length > pop){
            char temp  = chars[pop];
            chars[pop] = chars[length];

            chars[length] = temp;
            length--;
            pop++;
        }
    }


    /**
     *  采用分治法
     * @param s
     * @return
     */
    public String reverseParentheses1(String s) {

        return "";
    }

    public static void main(String[] args) {
        反转每对括号间的子串 a = new 反转每对括号间的子串();

        System.out.println(a.reverseParentheses( "a(bcdefghijkl(mno)p)q"));

    }

}
