package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 非递减序列
 * @Create : 2020/3/15
 * @Description :
 *
 *  非递减数列 定义 ：  对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 */
public class 非递减序列 {
    /**
     * 非递减，就是 递增
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {

        // 简单 的是，判断他有几处 是 nums[i] > nums[i+1] ,并且判断他的前后，是否能够改变数值，然后达到数组非递减
        if(nums.length < 3){
            return true;
        }
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                count++;
                if(count > 1){
                    break;
                }
                if(i-1 >=0&&nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                }else{
                    nums[i] = nums[i+1];
                }
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {

        非递减序列 a = new 非递减序列();

        System.out.println(a.checkPossibility(new int[]{3,4,2,3}));

    }
}
