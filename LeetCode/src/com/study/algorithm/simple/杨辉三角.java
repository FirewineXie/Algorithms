package com.study.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 杨辉三角
 * @Create : 2020/3/3
 * @Description :
 */
public class 杨辉三角 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = null;
        if (numRows == 0){
            return result;
        }
        if (numRows <= 2 && numRows> 0){
            for (int i = 0 ;i < numRows; i++){
                tmp = new ArrayList<>();
                for (int j = 0; j< i+1; j++){
                    tmp.add(1);
                }
                result.add(tmp);
            }
        }else {
            for (int i = 0 ;i < 2; i++){
                tmp = new ArrayList<>();
                for (int j = 0; j< i+1; j++){
                    tmp.add(1);
                }
                result.add(tmp);
            }
            for (int i = 3 ; i <= numRows  ; i++){
                int j = 0;
               List<Integer> rowtmp = new ArrayList<>();
               rowtmp.add(1);
               while (j < (i-2)){
                   rowtmp.add(tmp.get(j) + tmp.get(j+1));
                   j ++;
               }
               rowtmp.add(1);
               result.add(rowtmp);
               tmp = rowtmp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        杨辉三角 a = new 杨辉三角();

        System.out.println(a.generate(1).toString());
    }
}
