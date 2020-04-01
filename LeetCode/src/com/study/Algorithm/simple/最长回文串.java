package com.study.Algorithm.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 最长回文串
 * @Create : 2020/3/19
 * @Description :
 */
public class 最长回文串 {

    public int longestPalindrome(String s) {

        Map<Character, Integer> maps = new HashMap<>();
        //加入第一个字符
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                int tmp = maps.get(s.charAt(i));
                maps.put(s.charAt(i), ++tmp);
            } else {
                count = 1;
                maps.put(s.charAt(i), count);
            }
        }

        // 已经获取 他出现的次数，
        // 如果出现 次数为偶数的情况下，就可以添加到最长回文串里，如果出现2以上，那么获取完之后，减去2
        Set<Character> keySet = maps.keySet();
        int result = 0;

        //遍历键值
        for (char tmp : keySet) {

            if (maps.get(tmp) >= 2) {
//                    result++;
//                    获取后，减去获取的值
                int value = maps.get(tmp);
                while (value > 1) {

                    value = value -2;
                    maps.put(tmp, value);
                    result++;
                }
            }
        }


        if (maps.containsValue(1)) {
            return result * 2 + 1;
        } else {
            return result * 2;
        }
    }

    public static void main(String[] args) {
        最长回文串 a = new 最长回文串();

        System.out.println(a.longestPalindrome("aaabaaaa"));
    }
}
