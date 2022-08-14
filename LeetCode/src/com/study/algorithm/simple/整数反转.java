package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 整数反转.java
 * @Create : 2019-02-17-13:22
 * @Description :  给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class 整数反转 {

    public int reverse(int x) {


        String s = String.valueOf(x);

        char[] array = s.toCharArray();
        String reverse = "";
        if (x < 0){
            for (int i = 0; i < 1 ;i++){
                reverse += array[i];
            }
            for (int i = array.length - 1; i >= 1; i--) {
                reverse += array[i];
            }
        }else {
            for (int i = array.length - 1; i >= 0; i--) {
                reverse += array[i];
            }
        }
        try {

            int a = Integer.parseInt(reverse);
            return  a ;
        }catch (Exception e){

            return 0;
        }


    }

    public static void main(String[] args) {

        整数反转 aa  = new 整数反转();

        System.out.println(aa.reverse(-123));

    }
}
