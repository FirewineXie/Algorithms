package com.study.algorithm.middle;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 排序数组
 * @Create : 2020/3/31
 * @Description :
 */
public class 排序数组 {

    public int[] sortArray(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        quick_sort(nums,l,r);
        return nums;
    }

    public void quick_sort(int[] nums,int l ,int r){
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = nums[l];
            while (i < j)
            {
                while(i < j && nums[j] >= x) // 从右向左找第一个小于x的数
                {
                    j--;
                }
                if(i < j) {
                    nums[i++] = nums[j];
                }

                while(i < j && nums[i] < x) // 从左向右找第一个大于等于x的数
                {
                    i++;
                }
                if(i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = x;
            quick_sort(nums, l, i - 1); // 递归调用
            quick_sort(nums, i + 1, r);
        }
    }
    public static void main(String[] args) {


        排序数组 a = new 排序数组();

        int[] result = a.sortArray(new int[]{5, 2, 3, 1});

        for (int i =0; i< result.length ; i++){
            System.out.printf("%d\t",result[i]);
        }
    }
}
