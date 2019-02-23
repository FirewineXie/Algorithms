package com.study.Getting;

/**
 * @version : 1.0
 * @auther : xie     xyjworkgame@163.com
 * @Program Name: <br>
 * @Create : 2018-10-14-22:29
 */
public class ReverseInteger {


    public static int reverseInteger(int number){

        //不考虑数字输入的范围问题
        int a,b,c;

        if (number % 10 == 0){
            return number /100 ;
        }else {
            a = number / 100;
            b = number /10 %10;
            c = number % 10;

            return c*100+b*10+a;
        }

    }

    public static void main(String[] args) {

        System.out.println(ReverseInteger.reverseInteger(345));
    }
}
