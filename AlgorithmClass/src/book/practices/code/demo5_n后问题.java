package book.practices.code;

import java.util.Scanner;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: demo5_n后问题
 * @Create : 2020/1/1
 * @Description :
 */
public class demo5_n后问题 {

    public int n;
    int[] num = new int[21];
    /**
     * 打印结果
     * @param n
     */
    private void print(int n) {
        int i = 1;
        for (; i <= n; i++) {
            System.out.print(num[i]);
        }
        System.out.println();
        if ((i % 7) == 0) {
            System.out.println();
        }
    }

    /**
     * 测试x行y列可否摆放棋子，成功返回1，否则返回0
     * @param x
     * @param y
     * @return
     */
    private boolean trying(int x, int y) {
        int j =1;
        while (j < x) {
            if ((num[j] == y) || (Math.abs(x - j) == Math.abs(num[j] - y))) {
                return false;
            }
            ++j; // 右移一格继续尝试

        }
        return true;
    }

    /**
     * 进行递归的的
     * @param x
     */
    private void place(int x) {
        int y;
        if (x > n) {
            print(n);
        }else {
            for (y = 1; y <= n; ++y) {
                if (trying(x, y)) {
                    num[x] = y;
                    place(x+1);
                }
            }
        }
    }



    //还有另外一种方式： 迭代回溯


    public static void main(String[] args) {
        // Scanner cin = new Scanner(System.in);
        //
        // int n = cin.nextInt();
        demo5_n后问题  demo = new demo5_n后问题();
        demo.n  = 4;
        demo.place(1);
    }
}
