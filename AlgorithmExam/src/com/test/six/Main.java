package com.test.six;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Main
 * @Create : 2020/3/12
 * @Description :
 * 有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。在每一次，他可以进行三种操作中的一种：
 * <p>
 * 1． 向右走一格，即从(x,y)到(x,y+1);
 * <p>
 * 2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
 * <p>
 * 3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
 * <p>
 * <p>
 * <p>
 * 问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，请问他有多少种不同的路线可以到达(2,n)。
 */
/*
2.
给出一个序列包含n个正整数的序列A，然后给出一个正整数x，你可以对序列进行任意次操作的，每次操作你可以选择序列中的一个数字，让其与x做按位或运算。你的目的是让这个序列中的众数出现的次数最多。

请问众数最多出现多少次。


 */
public class Main {


    public static void main(String[] args) {


        Main a = new Main();

//        char[][] chars = new char[2][5];
//        char[] a1 = new char[]{'.', '.', 'X', '.', 'X'};
//        char[] a2 = new char[]{'X', 'X', '.', '.', '.'};
//        chars[0] = a1;
//        chars[0] = a2;
//        System.out.println(a.pathR(5, chars));

        String[] strings = new String[2];
        Scanner in = new Scanner(System.in);

//        int width = Integer.parseInt(in.nextLine());
//        String str1 = in.nextLine();
//
//        String str2 = in.nextLine();
        int width = 5;
        String str1 = "..X.X";
        String str2 = "XX...";

        strings[0] = str1;
        strings[1] = str2;

        System.out.println(a.pathR(width, strings));
    }

    private int pathR(int width, String[] strings) {

        int[][] result = new int[2][width];


        //设置初始值

        result[0][0] = 1;
        result[1][0] = 0;

        // 进行运算
        int i= 0;
        int j = 1;
        while (j !=  width){


            if(strings[i].charAt(j)=='X'){
                result[i][j] = 0;

                i++;
                if ( i ==2){
                    i = 0;
                    j++;
                }

            }else {
                if (i == 0) {
                    result[i][j] = result[i][j - 1] + result[i+1][j - 1];
                    i++;
                    if ( i ==2){
                        i = 0;
                        j++;
                    }

                }else {
                    result[i][j] = result[i][j - 1] + result[i-1][j - 1];
                    i++;
                    if ( i ==2){
                        i = 0;
                        j++;
                    }

                }

            }


        }
        //数组应用
        return result[1][width - 1];

    }

    private int pathR(int width, char[][] chars) {

        int[][] result = new int[2][width];


        //设置初始值

        result[0][0] = 1;
        result[0][1] = 0;

        // 进行运算
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < width; j++) {

                if (chars[i][j] == 'X') {
                    System.out.println(chars[i][j]);
                    // 不能通过设置为-1
                    result[i][j] = -1;
                } else {
                    //相加
                    result[i][j] = result[0][i - 1] + result[1][i - 1];
                }
            }
        }
        //数组应用
        return result[1][width - 1];

    }


}
