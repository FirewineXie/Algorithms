package com.study.algorithm.middle;

import java.util.Arrays;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 最大数_179.java
 * @createTime: 2021年04月12日 09:05:51
 * @Description TODO
 */
public class 最大数_179 {


    public static void main(String[] args) {

        最大数_179 n = new 最大数_179();

        System.out.println(n.largestNumber(new int[]{10, 2}));
    }

    public String largestNumber(int[] nums) {

        int n = nums.length;
        String numsToWord[] = new String[n];
        for(int i=0;i<n;i++){
            numsToWord[i] = String.valueOf(nums[i]);
        }
        //[233，23333]排序后变为[23333，233]
        Arrays.sort(numsToWord,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(numsToWord[i]);
        }
        String res = sb.toString();
        return res.charAt(0)=='0'?"0":res;


    }
}
