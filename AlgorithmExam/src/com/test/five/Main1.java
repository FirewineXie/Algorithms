package com.test.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Main1
 * @Create : 2020/3/11
 * @Description :
 */
public class Main1 {


    public static void main(String[] args) {

        // home 代表的是头，，end 是尾
       // String str = "Start_to_lear$n_so#mething";
        // 意思就是将，$ 然后# 号结尾  字符串放到最前面，

        Main1 bb = new Main1();

        Scanner in =new Scanner(System.in);
        String str = in.next();


        bb.rightTxt(str);
    }

    private String rightTxt(String str) {

        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        List<Integer> record = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == '$') {
                record.add(i);
            }
            if (chars[i] == '#') {
                record.add(i);
            }
        }

        // 已经记录好了 位置
        // 成对出现，那么肯定 为偶数
        int count = record.size() / 2;
        int i = record.size() -1;

        result.append(chars,record.get(i-1),record.get(i));
        result.append(chars,0,record.get(i-1));
        result.append(chars,record.get(i),chars.length);


        return result.toString();
    }


}
