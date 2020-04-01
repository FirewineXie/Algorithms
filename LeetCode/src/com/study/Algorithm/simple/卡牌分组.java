package com.study.Algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 卡牌分组
 * @Create : 2020/3/27
 * @Description :
 */
public class 卡牌分组 {

    /**
     * 直接进行排序，然后进行判断
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {

        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck) {
            count[c]++;
        }

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i) {
            if (count[i] > 0) {
                values.add(count[i]);
            }
        }

        search: for (int X = 2; X <= N; ++X) {
            if (N % X == 0) {
                for (int v: values) {
                    if (v % X != 0) {
                        continue search;
                    }
                }
                return true;
            }
        }

        return false;



    }

    public static void main(String[] args) {

        卡牌分组 a = new 卡牌分组();

        System.out.println(a.hasGroupsSizeX(new int[]{0,0,0,0,1,1,2,2,3,3}));

    }
}
