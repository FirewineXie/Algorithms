package com.study.Algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 杨辉三角II
 * @Create : 2020/3/3
 * @Description :
 */
public class 杨辉三角II {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();


        if (rowIndex < 2) {
            for (int j = 0; j < rowIndex+1; j++) {
                result.add(1);
            }
        } else {
            for (int j = 0; j < 2; j++) {
                result.add(1);
                // row2
            }
            for (int i = 3; i <= rowIndex+1; i++) {
                int a = 0;
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                while (a < (i-2)) {
                    tmp.add(result.get(a) + result.get(a + 1));
                    a++;
                }
                tmp.add(1);
                result = tmp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        杨辉三角II a = new 杨辉三角II();

        System.out.println(a.getRow(2));
    }
}
