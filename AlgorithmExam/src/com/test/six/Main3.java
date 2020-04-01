package com.test.six;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Main3
 * @Create : 2020/3/12
 * @Description :
 * 小美曾经有一个特殊的数组，这个数组的长度为n。但是她在打恐怖游戏的时候被吓得忘记了这个数组长什么样了。不过她还记得这个数组满足一些条件。
 *
 * 首先这个数组的每个数的范围都在L和R之间。包括端点。
 *
 * 除此之外，这个数组满足数组中的所有元素的和是k的倍数。
 *
 * 但是这样的数组太多了，小美想知道有多少个这样的数组。你只需要告诉她在模1e9+7意义下的答案就行了。
 */
public class Main3 {


    public static void main(String[] args) {

        //9 1 1 3
        //一行四个整数n,k,L,R
        //
        //（1≤n≤1e5    1≤k≤10    1≤L≤R≤1e9）
        int n = 9;
        int k = 1;
        int l = 1;
        int r = 3;

        // 如果都是1，，那么数组最小和为 9
        // 如果都是 3，那么数组最大和为 27;


        Main3 a = new Main3();


//        a.countArray(n,k,l,r);
    }

/*    private int countArray(int n, int k, int l, int r) {

        int[] a = new int[n];
        if (n == 1){

            if (k> l && k < r){
                return 1;
            }else {
                return 0;
            }
        }else {
            int i =0;

        }
    }*/


}
