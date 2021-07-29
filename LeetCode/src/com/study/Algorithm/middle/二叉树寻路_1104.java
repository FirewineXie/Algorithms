package com.study.Algorithm.middle;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author XYJ
 * @version 1.0.0
 * @ClassName 二叉树寻路_1104
 * @createTime: 2021年07月29日 08:56:16
 * @Description TODO
 */
public class 二叉树寻路_1104 {


    /*
     *  1. 第一层默认是1
     *  2.
     *
     *
     *
     * */

    public static void main(String[] args) {


    }

    /**
     * @param label
     * @return
     */
    public List<Integer> pathInZigZagTree(int label) {

        int row = 1, rowStart = 1;
        while (rowStart * 2 <= label) {
            row++;
            rowStart *= 2;
        }
        if (row % 2 == 0) {
            label = getReverse(label, row);
        }
        List<Integer> path = new ArrayList<Integer>();
        while (row > 0) {
            if (row % 2 == 0) {
                path.add(getReverse(label, row));
            } else {
                path.add(label);
            }
            row--;
            label >>= 1;
        }
        Collections.reverse(path);
        return path;
    }

    public int getReverse(int label, int row) {
        return (1 << row - 1) + (1 << row) - 1 - label;
    }

}
