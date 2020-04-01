package com.test.one;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code1
 * @Create : 2020/2/28
 * @Description :
 * JtPUzLZymTHAfFCgGaMxXOEkRIvduq qRIvEOXkduaMxFCATmHfgLZzUPytGJ
 *
 * 给出源字符串，和目标字符串，，如果进行进栈E 出站D
 * 如果能够满足目标字符串的顺序，那么返回ED字符串
 * 不能满足返回-1
 */
public class code1 {

    public String test(String str, String str1) {
        //JtPUzLZymTHAfFCgGaMxXOEkRIvduq
        //qRIvEOXkduaMxFCATmHfgLZzUPytGJ
        //EDEEEEEDDDEEDEDEDDDDEEEDDDEEEEDDEEDEEDEDDDDEEEDDEDEDEDDEDDED

        Stack<Character> stack = new Stack<>();
        //目的字符串
        String reslult = "";
        //str 为源字符串
        char[] charsStr = str.toCharArray();
        char[] charsStr1 = str1.toCharArray();
        //先压入第一个
        stack.push(charsStr[charsStr.length - 1]);
        reslult += "E";
        int i = 0;
        int j =1;

        while (true) {

            if (stack.isEmpty() == false){
            //如果对比字符串不等于栈的第一个，那么继续压栈
            if (stack.elementAt(stack.size()-1) != charsStr1[i]) {
                //将源字符串最后一个压进去
                stack.push(charsStr[charsStr.length - j]);
                j++;
                reslult += "E";
            } else {
                stack.pop();
                i ++;
                reslult += "D";

            }}else {
                j++;
                //如果栈为空，那么压栈
                stack.push(charsStr[charsStr.length - j]);

                reslult += "E";
            }

            if (i == charsStr.length){
                break;
            }
        }
        System.out.println(reslult);
        return reslult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        code1 code = new code1();
        code.test(a,b);
    }
}
