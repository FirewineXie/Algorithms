package com.basic.training;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: P11.java
 * @Create : 2019-02-14-16:44
 * @Description :  <br/>
 */
public class P11 {

    public static void main(String[] args) {

        boolean[][] aa = new boolean[10][10];
        print(aa);
    }

    private static void print(boolean[][] aa) {

        boolean[][] bb = RandomInitial(aa);

        for (int k = 1; k<= aa.length ; k++ ){
            System.out.print("  " + k);


        }
        System.out.println(" ");
        for (int i =0 ;i < bb.length ;i++){
            System.out.print(i+1 + " ");
           for (int j = 0; j< bb.length ; j++){

               if (aa[i][j]){
                   System.out.print("*" +" " );
               }else {
                   System.out.print(" " + " ");
               }
           }
            System.out.println();
        }

    }

    private static boolean[][] RandomInitial(boolean[][] aa) {

        for (int i = 0; i < aa.length; i++) {
            //行
            for (int j = 0; j < aa.length; j++) {
                // 列
                if (StdRandom.bernoulli(0.1)) {
                    aa[i][j] = true;
                } else {
                    aa[i][j] = false;
                }
            }
        }

        return aa;
    }
}
