package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 买卖股票的最佳时机
 * @Create : 2020/3/5
 * @Description :
 */
public class 买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {

//        int[] tmp1 = new int[prices.length];
        int sum = 0;
        for (int i = 0; i < prices.length ;i++){
            for (int j = i+1 ; j< prices.length ;j++){
                int tmp =  prices[j] - prices[i];
                if (tmp > sum){
                    sum = tmp;
                }

            }
        }


        return sum;
    }

    public static void main(String[] args) {
        买卖股票的最佳时机 a= new 买卖股票的最佳时机();

        System.out.println(a.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
