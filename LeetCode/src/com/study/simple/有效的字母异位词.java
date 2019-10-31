package com.study.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 有效的字母异位词 .java
 * @Create : 2019-04-17-18:27
 * @Description :
 */
public class 有效的字母异位词 {

    public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return String.valueOf(a).equals(String.valueOf(b));
    }
    public boolean isAnagram1(String s, String t) {
        //通过 26个字母表进行计数，然后通过比对
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            // 有着key值 默认加1，， 没有 新建
        }
        for (char ch : t.toCharArray()) {
            Integer count = map.get(ch);
            if (count == null) {
                return false;
            } else if (count > 1) {
                map.put(ch, count - 1);
            } else {
                map.remove(ch);
            }
        }
        return map.isEmpty();


    }
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";

       有效的字母异位词 a = new 有效的字母异位词();

        System.out.println(a.isAnagram1(s, t));

    }
}
