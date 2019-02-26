package com.study.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 独特的电子邮件地址.java
 * @Create : 2019-02-26-22:38
 * @Description :
 * （'.'），则发往那里的邮件将会转发到本地名称中没有点的同一地址
 * （'+'），则会忽略第一个加号后面的所有内容。
 */
public class 独特的电子邮件地址 {


    public int numUniqueEmails(String[] emails) {

        Set<String> email = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            if (emails[i].contains("+")) {
                //域名
                String tempa = emails[i].substring(emails[i].indexOf('@'), emails[i].length());
                //0到第一个字符+
                String tempc = emails[i].substring(0, emails[i].indexOf('+'));
                //这块接着判断是否有点.
                if (tempc.contains(".")){
                    String[] temp = tempc.split(".");
                    String temp1 = "";
                    for (String a : temp) {
                        temp1 += a;
                    }
                    temp1 += tempa;
                    email.add(temp1);
                }else {
                    tempc += tempa;
                    email.add(tempc);
                }

            } else {
                //获取域名
                String tempa = emails[i].substring(emails[i].indexOf('@'),emails[i].length());
                //字符@前面的字符串
                String tempc = emails[i].substring(0,emails[i].indexOf('@'));
                //判断是否有点
                if (tempc.contains(".")){
                    String[] temp = tempc.split(".");
                    String temp1 = "";
                    for (String a : temp) {
                        temp1 += a;
                    }
                    temp1 += tempa;
                    email.add(temp1);

                }else {
                    tempc += tempa;
                    email.add(tempc);
                }


            }
        }


        return email.size();
    }

    public static void main(String[] args) {
        String[] emails1 = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        String[] emails = new String[]{"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"};
        独特的电子邮件地址 aa = new 独特的电子邮件地址();
        System.out.println((aa.numUniqueEmails(emails)));

    }
}
