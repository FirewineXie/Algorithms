package com.study.Getting;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-14-23:20
 */
public class Fibonacci {

    public static int fibonacci(int n){
        int a = 0;
        int b =1;
        int c = 1;
        if (n ==1){
            return 0;
        }else if(n == 2){
            return 1;
        }
        for (int i =2;i<=n;i++){
            c =a + b;
            b =a;
            a =c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println( Fibonacci.fibonacci(10));
    }

}
