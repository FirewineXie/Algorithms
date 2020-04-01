package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Programe Name: 爬楼梯
 * @Create : 2020/3/1
 * @Description :70. 爬楼梯
 */
public class 爬楼梯 {

    /*
      1     2   3                4       5
  1   1   1+1   1+1+1           1+1+1+1
  2   0   2    1+2 or 2+1    f(3) + 1  or f(2) + 2
   1   1   2    3      5

     */

    /**
     * 动态规划求解问题
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        if (n == 0){
            return 1;
        }
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2 ;i<= n ;i++){
            array[i] = array[i -1] + array[i -2];
        }
        return array[n];
    }

    public static void main(String[] args) {

        爬楼梯 a= new 爬楼梯();
        System.out.println(a.climbStairs(4));
    }
}
