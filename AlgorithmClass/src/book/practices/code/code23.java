package book.practices.code;

import java.util.ArrayList;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: code23
 * @Create : 2019/12/26
 * @Description :
 */
public class code23 {

    int[] result  = new int[20];


    /**
     * 半数集 的问题
     *
     */
    private int setBS(int a) {

        int i,sum = 1;
        /**
         * if 判断
         */
        if (result[a] > 0){
            result[a] = sum;

        }
        for (i = 1; i <= a / 2; i++) {
            sum += setBS(i);
        }
        result[a]  = sum;
        return sum;

    }

    public static void main(String[] args) {
        int n =6;

        code23 demo = new code23();

        System.out.println(demo.setBS(n));
    }
}
