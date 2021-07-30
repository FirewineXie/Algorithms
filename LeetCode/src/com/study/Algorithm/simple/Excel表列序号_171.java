package com.study.Algorithm.simple;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Excel表列序号_171
 * @createTime: 2021年07月30日 16:17:15
 * @Description TODO
 */
public class Excel表列序号_171 {

    public static void main(String[] args) {
        Excel表列序号_171 a = new Excel表列序号_171();
        a.titleToNumber("AA");
    }

    public int titleToNumber(String columnTitle) {
        int ans = 0;
        char[] cArray = columnTitle.toCharArray();
        for (char c : cArray) {
            ans = (ans * 26 + (c - 'A' + 1));
            System.out.println(ans);
        }

        return ans;
    }
}
