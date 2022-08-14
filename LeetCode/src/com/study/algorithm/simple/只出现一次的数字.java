package com.study.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 只出现一次的数字
 * @Create : 2020/3/16
 * @Description :
 */
public class 只出现一次的数字 {

    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1; // can't find it.
    }

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        只出现一次的数字 a= new 只出现一次的数字();

        System.out.println(a.singleNumber(new int[]{2, 2, 1}));
    }
}
