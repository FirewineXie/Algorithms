package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 将数组分成和相等的三个部分
 * @Create : 2020/3/11
 * @Description :
 */
public class 将数组分成和相等的三个部分 {

    /**
     * 双指针 怎么样
     *
     * @param A
     * @return
     */
    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum%3 != 0){
            // 总和不是3的倍数，直接返回false
            return false;
        }

        // 使用双指针,从数组两头开始一起找，节约时间
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];

        // 使用left + 1 < right 的原因，防止只能将数组分成两个部分
        // 例如：[1,-1,1,-1]，使用left < right作为判断条件就会出错
        while(left + 1 < right){
            if(leftSum == sum/3 && rightSum == sum/3){
                // 左右两边都等于 sum/3 ，中间也一定等于
                return true;
            }
            if(leftSum != sum/3){
                // left = 0赋予了初值，应该先left++，在leftSum += A[left];
                leftSum += A[++left];
            }
            if(rightSum != sum/3){
                // right = A.length - 1 赋予了初值，应该先right--，在rightSum += A[right];
                rightSum += A[--right];
            }
        }
        return false;
    }

    private int sumArray(int[] A, int left, int right) {

        int result = 0;
        for (int i = left; i < right; i++) {
            result += A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        将数组分成和相等的三个部分 a = new 将数组分成和相等的三个部分();

        int[] bb = new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(a.canThreePartsEqualSum(bb));

    }
}
