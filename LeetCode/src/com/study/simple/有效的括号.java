package com.study.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 有效的括号.java
 * @Create : 2019-02-20-15:21
 * @Description :
 */
public class 有效的括号 {


    public boolean isValid(String s) {
        HashMap<Character,Character> characterMap = new HashMap<>();
        characterMap.put('(',')');
        characterMap.put('{','}');
        characterMap.put('[', ']');

        Stack<Character> num = new Stack<>();

        char[] achar = s.toCharArray();

        for (char a  : achar){
            if (num.empty()){
                num.push(a);
            }else {
                char temp = num.pop();
                if (characterMap.containsKey(temp)){
                    if (characterMap.get(temp) == a){
                        continue;
                    }else {
                        num.push(temp);
                        num.push(a);
                    }
                }else {
                    return false;
                }
            }
        }
        if (num.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {



        有效的括号 aa = new 有效的括号();

        System.out.println(aa.isValid("(]"));
    }
}
