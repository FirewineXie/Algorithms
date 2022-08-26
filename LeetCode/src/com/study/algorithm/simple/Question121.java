package com.study.algorithm.simple;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question121
 * @createTime 2022年08月23日 09:14:04
 * @Description TODO
 */
public class Question121 {

    public int maxProfit(int[] prices) {

        int maxFix = 0;
        int minPrices = prices[0];
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrices){
                minPrices = prices[i];
            }
            if ((prices[i] - minPrices) > maxFix){
                maxFix = prices[i] - minPrices;
            }

        }
        return maxFix;
    }
}
