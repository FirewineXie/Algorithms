package com.study.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 增减字符串匹配 .java
 * @Create : 2019-02-27-14:50
 * @Description :
 */
public class 增减字符串匹配 {
    public int[] diStringMatch(String S) {

        //字符串的数组

        //数字的数组
        int[] num = new int[S.length()+1];

        int max = S.length();
        int min  = 0;
        //开始判断
        for (int j=0;j < S.length();j++){
            char s = S.charAt(j);
            if (s =='D'){
                num[j] = max--;
            }else {
                num[j] =min++;
            }
        }
        num[S.length()] = min;
        return num;
    }

    public static void main(String[] args) {

        增减字符串匹配 aa = new 增减字符串匹配();

        String a = "IDID";
        int[] b = aa.diStringMatch(a);
        for (int te : b) {
            System.out.printf("%s ", te);
        }
    }

}
