package com.study.Algorithm.simple;


/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 外观数列
 * @Create : 2020/2/29
 * @Description :
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 */
public class 外观数列 {

    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        } else {
            return result1(countAndSay(n - 1));
        }
    }

    private String result1(String countAndSay) {
        StringBuilder stringBuilder = new StringBuilder();
        //计数
        int count = 1;
        char temp;
        int i = 0;


        if (countAndSay.length() == 1) {
            stringBuilder.append(11);
            return stringBuilder.toString();
        } else {
            //获得字符串第一个数字
            temp = countAndSay.charAt(0);

            for (int a = 1; a < countAndSay.length(); a++) {

                if (temp == countAndSay.charAt(a)) {
                    count++;
                } else {
                    stringBuilder.append(count);
                    stringBuilder.append(temp);
                    //上面是添加数据完毕
                    count = 1;
                    temp = countAndSay.charAt(a);
                }
            }
            //因为最后一个无法通过上述情况加入
            String str = String.valueOf(count) + String.valueOf(countAndSay.charAt(countAndSay.length() - 1));
            return stringBuilder.toString() + str;
        }
    }





    public static void main(String[] args) {

        外观数列 a = new 外观数列();

        System.out.println(a.countAndSay(4));
    }
}
