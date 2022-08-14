package com.study.algorithm.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 数组形式的整数加法 .java
 * @Create : 2019-03-05-11:19
 * @Description :
 */
public class 数组形式的整数加法 {

    public List<Integer> addToArrayForm1(int[] A, int K) {

        String sum = "";
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        int a = Integer.parseInt(sum) + K;
        System.out.println(a);

        String temp = String.valueOf(a);
        System.out.println(temp);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < temp.length(); i++) {

            result.add(Integer.valueOf(temp.substring(i, i + 1)));

        }
        return result;

    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0){

                cur += A[i];
            }
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {


        数组形式的整数加法 aa = new 数组形式的整数加法();

        int[] a = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};


        System.out.println(aa.addToArrayForm(a, 1));


    }
}
