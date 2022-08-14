package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 买卖股票的最佳时机II
 * @Create : 2020/3/5
 * @Description :
 */
public class 买卖股票的最佳时机II {


    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }
        public int calculate(int prices[], int s) {
            if (s >= prices.length) {
                return 0;
            }
            int max = 0;
            for (int start = s; start < prices.length; start++) {
                int maxprofit = 0;
                for (int i = start + 1; i < prices.length; i++) {
                    if (prices[start] < prices[i]) {
                        int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                        if (profit > maxprofit) {
                            maxprofit = profit;
                        }
                    }
                }
                if (maxprofit > max) {
                    max = maxprofit;
                }
            }
            return max;
        }

    public int maxProfit1(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
    public int maxProfit3(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        买卖股票的最佳时机II  a = new 买卖股票的最佳时机II();


        System.out.println(a.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
