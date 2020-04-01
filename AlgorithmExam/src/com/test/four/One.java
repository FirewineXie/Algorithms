package com.test.four;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: One
 * @Create : 2020/3/5
 * @Description :
 *   一对小兔子，生无数个小兔子
 */
public class One {

    public int total(int month){

        return calue(month) * 2 ;
    }

    private int calue(int month) {

        //这是对数
        int sum = 1;
        if (month <= 3){
            return 1;
        }else {
            return  sum + calue(month -1);
        }
    }

    public static void main(String[] args) {
        One a = new One();

        System.out.println(a.total(5));

    }

}
