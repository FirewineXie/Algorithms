package com.basic.training;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: P13.java
 * @Create : 2019-02-14-17:21
 * @Description :  <br/>
 */
public class P13 {

    public static void main(String[] args) {

        int n=5,m=5;
        //原矩阵
        int[][] aa = new int[m][n];
        //转之后的
        int[][] bb = new int[n][m];

        RandomInitial(aa);
       bb = ChangeArrays(aa,bb);
        printArray(aa);
        System.out.println("\n");
        printArray(bb);
    }

    private static void printArray(int[][] aa) {
        for (int i = 0; i < aa.length; i++){
            for (int j=0 ;j < aa.length ;j++){

                System.out.print(aa[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] ChangeArrays(int[][] aa, int[][] bb) {

        for (int i = 0; i < aa.length; i++){
            for (int j=0 ;j < aa.length ;j++){

                bb[j][i] = aa[i][j];
            }
        }
        return bb;
    }

    private static void RandomInitial(int[][] aa) {
        Random r = new Random();
        for (int i=0; i < aa.length; i++){
            for (int j=0; j < aa.length ; j++){

                aa[i][j] = r.nextInt(10);
            }
        }

    }
}
