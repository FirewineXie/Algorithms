package book.practices.code;

import java.util.Arrays;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code45
 * @Create : 2019/12/30
 * @Description :
 *
 *
 * 程序存储问题，，在一个磁带上面存储尽量更多的程雪
 */
public class code45 {


    private int solve(int n, int length ,int[] num){

        Arrays.sort(num);
        // 程序长度
        int temp = 0;
        int count = n;
        for (int i = 0 ;i < n; i++){
            if ((temp += num[i] ) > length){
                count --;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        code45 demo = new code45();

        System.out.println(demo.solve(6, 50, new int[]{2, 3, 13, 8, 80, 20}));
    }
}

