package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 拼写单词
 * @Create : 2020/3/17
 * @Description :
 */
public class 拼写单词 {
    public int countCharacters(String[] words, String chars) {
        int[] c = new int[26];
        for(char cc : chars.toCharArray()) {
            c[(int)(cc - 'a')] += 1;
        }
        int res = 0;
        a: for(String word : words) {
            int[] w = new int[26];
            for(char ww : word.toCharArray()) {
                w[(int)(ww - 'a')] += 1;
            }
            for(int i=0; i<26; i++) {
                if(w[i] > c[i]) {
                    continue a;
                }
            }
            res += word.length();
        }
        return res;
    }


    public static void main(String[] args) {
        拼写单词 a = new 拼写单词();


        System.out.println(a.countCharacters(new String[]{"cat","bt","hat","tree"},"atach"));
    }
}
