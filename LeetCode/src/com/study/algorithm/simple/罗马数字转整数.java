package com.study.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 罗马数字转整数.java
 * @Create : 2019-02-18-20:20
 * @Description :  根据输入的数字，打印出相对应的罗马数字
 *
 *
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，
 * 例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 *     I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *     X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 *     C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class 罗马数字转整数 {

    public int romanToInt(String s) {

        Map<Character,Integer> contrast = new HashMap<>();
        contrast.put('I',1);
        contrast.put('V',5);
        contrast.put('X',10);
        contrast.put('L',50);
        contrast.put('C',100);
        contrast.put('D',500);
        contrast.put('M',1000);

        char[] array = s.toCharArray();

        int   number = 0;
        for (int i = 0; i < s.length(); ++i) {

//            System.out.println(contrast.get(第1章_数组[i]));
            int val = contrast.get(array[i]);

            if (i == s.length() - 1 || contrast.get(array[i+1]) <= contrast.get(array[i])){
                number += val;
            }
            else{
                number -= val;
            }
        }
        return number;
    }

    /**
     * 将数字转化成罗马数字
     * @param s
     * @return
     */
    public String intToRoman(String s){

        return null;
    }


    public static void main(String[] args) {

        罗马数字转整数 aa = new 罗马数字转整数();

        System.out.println(aa.romanToInt("III"));
    }
}
