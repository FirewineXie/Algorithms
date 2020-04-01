package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 加一
 * @Create : 2020/3/1
 * @Description :
 */
public class 加一 {

    public int[] plusOne(int[] digits) {


        // 因为是静态数组的缘故，那么要在增加位置
        // 要考虑进位的关系
        // 1. 考虑最高位的进位存在，那么数组必须向后移动
        // 2. 考虑个位的进位存在
        digits[digits.length - 1] += 1;
        //   1. 个位的进位（其他位恰好也是通过个位的进位，也必须进位）
        //   2. 只有个位进位 的存在

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] != 10) {

                break;
            }
            if (digits[i] == 10) {
                digits[i] = 0;
                if ((i-1) == -1){
                    break;
                }
                digits[i - 1] += 1;
            }
        }

//        System.out.println(digits[0]);
        if (digits[0] == 10){
            digits = new int[digits.length+1];
            digits[0] =1;
            for (int i =1 ;i< digits.length;i++){
                digits[i] = 0;
            }
        }


       return digits;
}
    public int[] plusOne1(int[] digits) {

        int num = 0;
        for (int i = 0; i< digits.length ; i++){

            num += digits[i] * Math.pow(10,digits.length-i-1);
            System.out.println(num);
        }
        num += 1;
        System.out.println(num);
        char[] temp = String.valueOf(num).toCharArray();
        if (temp.length == digits.length){
            for (int i = 0 ; i< temp.length;i++){
                digits[i] = Integer.parseInt(String.valueOf(temp[i]));
            }
        }else {
            digits = new int[temp.length];
            for (int i = 0 ; i< temp.length;i++){
                digits[i] = Integer.parseInt(String.valueOf(temp[i]));
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        加一 a = new 加一();
//        [9,8,7,6,5,4,3,2,1,0]
        int[] b = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] c =  a.plusOne(b);


    }
}
