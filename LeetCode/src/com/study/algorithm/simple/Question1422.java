package com.study.algorithm.simple;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1422
 * @createTime 2022年08月14日 10:21:42
 * @Description TODO
 */
public class Question1422 {


    public int maxScore(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            int score = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    score++;
                }
            }
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    score++;
                }
            }
            ans = Math.max(ans, score);
        }
        return ans;

    }

}
