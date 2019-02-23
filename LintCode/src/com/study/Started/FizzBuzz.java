package com.study.Started;

import java.util.ArrayList;
import java.util.List;

/**
 * @version : 1.0
 * @auther : xie     xyjworkgame@163.com
 * @Program Name: <br>
 * @Create : 2018-10-16-22:59
 */
public class FizzBuzz {



    public static List<String> fizzBuzz(int n) {
        // write your code here

        List<String> cc  = new ArrayList<String>();

        for (int i = 1;i <=n; i++){
            if (i % 3 ==0 && i % 5 ==0){
                cc.add("fizz buzz");
                continue;
            }else if (i %5 == 0){

                cc.add("buzz");
            }else if (i % 3 ==0) {
                cc.add("fizz");
            }else {

                cc.add(String.valueOf(i));
            }
        }

        return cc;
    }

    public static void main(String[] args) {


        System.out.println(FizzBuzz.fizzBuzz(20));
    }
}
