package com.study.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题57II_和为s的连续正数序列
 * @Create : 2020/3/6
 * @Description :
 */
public class 面试题57II_和为s的连续正数序列 {


    public static void main(String[] args) {

        Solution1 a = new Solution1();
        int[][] bb = a.findContinuousSequence(9);
    }
}

class Solution1 {
    /**
     * 利用滑动窗口
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        // 滑动窗口的左边界
        int left = 1;
        // 滑动窗口的右边界
        int right = 1;
        // 滑动窗口中数字的和
        int sum = 0;

        List<int[]> result = new ArrayList<>();

        while (left <= target /2){
            if (sum <target){
                //右边界向右移动
                sum += right;
                right++;
            }else  if (sum > target){
                //左边界向右移动
                sum -= left;
                left++;
            }else {
                int [] arr = new int[right - left];
                for (int k = left; k < right; k++){
                    arr[k-left] = k;
                }
                result.add(arr);
                //左边界向右移动
                sum -= left;
                left++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
