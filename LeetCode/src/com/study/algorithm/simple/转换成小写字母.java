package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 转换成小写字母 .java
 * @Create : 2019-02-26-8:55
 * @Description :
 */
public class 转换成小写字母 {
    /**
     *  26 个小写的英文字母a_z 的AscII是97-122 ，，而大写的A-Z是65-90 ，，小写比大写大32
     *  可以判断每个字符的ASCII码，，然后在进行是否相减
     * @param str
     * @return
     */
    public String toLowerCase(String str) {

        char[] strChar = str.toCharArray();
        String temp ="";
        for (int i=0; i< str.length(); i++){
            if ((strChar[i] <= 122) && (strChar[i] >= 97)){
                temp += strChar[i];
            }else if ((strChar[i] >= 65) && (strChar[i] <= 90)){
                temp += (char) (strChar[i] + 32);
            }else {
                temp += strChar[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        转换成小写字母 aa = new 转换成小写字母();
        System.out.println(aa.toLowerCase("Hell#o"));
    }
}
