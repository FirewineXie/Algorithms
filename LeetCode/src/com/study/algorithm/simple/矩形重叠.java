package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 矩形重叠
 * @Create : 2020/3/18
 * @Description :
 */
public class 矩形重叠 {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top


    }

    public static void main(String[] args) {
        矩形重叠 a = new 矩形重叠();
        a.isRectangleOverlap(new int[]{0,0,2,2},new int[]{1,1,3,3});
    }
}
