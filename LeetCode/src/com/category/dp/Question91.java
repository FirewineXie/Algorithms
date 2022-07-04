package com.category.dp;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question91
 * @createTime 2022年07月01日 09:48:41
 * @Description TODO
 */
public class Question91 {

    /**
     * 限界条件
     * s[i] < 10   条件  1 < i < s.length
     * 10 <= s[j] <= 26 条件  1 < i  < s.length
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        int n = s.length();
        // a = f[i-2], b = f[i-1], c=f[i]
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; ++i) {
            c = 0;
            if (s.charAt(i - 1) != '0') {
                c += b;
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                c += a;
            }
            a = b;
            b = c;
        }
        return c;

    }
}
