package com.study.algorithm.middle;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 零钱兑换
 * @Create : 2020/3/8
 * @Description :
 */
public class 零钱兑换 {
    /**
     * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
     * 如果没有任何一种硬币组合能组成总金额，返回 -1。
     *
     * 最少硬币的个数
     * 而 题目中，说到，每个硬币的数量是无限的
     *
     * 回溯法
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        return coinChange(0, coins, amount);
    }

    private int coinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange(idxCoin + 1, coins, amount - x * coins[idxCoin]);
                    if (res != -1) {
                        minCost = Math.min(minCost, res + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE)? -1: minCost;
        }
        return -1;
    }
    //动态规划
    public int coinChange1(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        return coinChange2(coins, amount, new int[amount]);
    }

    private int coinChange2(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange2(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }


    public static void main(String[] args) {
        零钱兑换 a= new 零钱兑换();
//        int[] b  = new int[]{1,2,5};
//        System.out.println(a.coinChange(b,11));
//
//        int[] b1  = new int[]{2};
//        System.out.println(a.coinChange(b1,3));
//
        System.out.println(a.coinChange1(new int[]{1,2,5},11));
//
//        System.out.println(a.coinChange(new int[]{2,5,10,1}, 27));

//        System.out.println(a.coinChange(new int[]{186,419,83,408}, 6429));
    }
}
