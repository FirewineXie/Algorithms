package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题01_06_字符串压缩
 * @Create : 2020/3/16
 * @Description :
 */
public class 面试题01_06_字符串压缩 {

    public String compressString(String S) {


        if (S.length() == 0){
            return "";
        }else if (S.length() == 1){
            return S;
        }else {
            //字符串长度大于2
            StringBuilder result = new StringBuilder();
            int count =1;
            char first = S.charAt(0);
            for (int i = 1; i < S.length(); i++) {

                if (first == S.charAt(i)){
                    count ++;
                    // 如果最后面都是重复的，那么要这里是缺少最后一部分的
                    if (i == S.length()-1){
                        result.append(first);
                        result.append(count);
                    }
                }else {
                    result.append(first);
                    result.append(count);
                    count = 1;
                    first = S.charAt(i);
                    if ( i == S.length() -1){
                        result.append(first);
                        result.append(count);
                    }
                }
            }
            System.out.println(result.toString().length());
            System.out.println(S.length());
            return result.length() < S.length()? result.toString():S;
        }

    }
    public static void main(String[] args) {
        面试题01_06_字符串压缩 a= new 面试题01_06_字符串压缩();

        System.out.println(a.compressString("bb"));

    }
}
