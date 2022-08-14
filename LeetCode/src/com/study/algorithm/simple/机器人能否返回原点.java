package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 机器人能否返回原点 .java
 * @Create : 2019-03-03-17:28
 * @Description :
 */
public class 机器人能否返回原点 {

    public boolean judgeCircle(String moves) {


        //定义xy抽坐标，默认机器人在原点
        int x=0;
        int y =0;

        char[] move = moves.toCharArray();
        for (char a : move){
            if (a == 'U'){
                y++;
            }else if (a == 'D'){
                y--;
            }else if (a =='R'){
                x--;
            }else if (a == 'L'){
                x++;
            }
        }

        if (x==0 && y==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        机器人能否返回原点 aa = new 机器人能否返回原点();

        System.out.println(aa.judgeCircle("LL"));

    }
}
