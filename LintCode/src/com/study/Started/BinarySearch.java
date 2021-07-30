package com.study.Started;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-18-23:06
 */
public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        // write your code here
        int tmp = nums.length / 2;

        int[] num1  = new int[tmp];



        if (nums[tmp] <= target){
            for (int i = 0 ;i < tmp; i++){
                System.out.println(nums[i]);
                if(nums[i] == target){
                    System.out.println(nums[i]);
                    return i;
                }else{

                    nums[i] = num1[i];
                    return binarySearch(num1,target);
                }
            }
        }else{
            for (int i = tmp; i <= nums.length; i ++){

                if (nums[i] == target){
                    return i;
                }else {
                    num1[i-(tmp+1)] = nums[i];
                    return binarySearch(num1,target);
                }
            }
        }
        return -1;
    }
    public static int binarySearch1(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        int mid = (left + right) / 2;
        while (left < right){
            if (nums[mid] < target){
                left = mid+1;
            }
            if (nums[mid] >= target){
                right = mid;
            }
            mid = (left + right ) /2;
        }
        return nums[mid] == target ? mid : -1;
    }



    public static void main(String[] args) {

        //默认整数数组的排序是升序，
        int[] nums = {1,2,3,3,4,5,10};

        System.out.println(binarySearch1(nums,3));
    }
}
