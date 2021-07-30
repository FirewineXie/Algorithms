package com.study.Started;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-15-22:25
 */
public class Aplusb {


    public int aplusb(int a, int b) {
        // write your code here

        int sum = a ^ b;
        int carry = (a & b) << 1;

        while (carry != 0){
            //进位
            int tmpCarry = (sum & carry) << 1;
            //不进位的结果，如果进位为0，循环结束
            sum = sum ^ carry;
            carry = tmpCarry;
        }
        return sum;

    }

    public static void main(String[] args) {
        Aplusb a = new Aplusb();
        System.out.println(a.aplusb(3,7));
    }
}
