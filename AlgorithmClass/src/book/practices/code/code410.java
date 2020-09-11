package book.practices.code;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code410
 * @Create : 2019/12/31
 * @Description :
 *
 *
 * 区间覆盖问题
 */
public class code410 {


    private void solve(int n, int length, int[] num) {
        //直接上的数，可能使负数也有可能使相等，，记得区别

        Arrays.sort(num);

        int count = 1;

        for (int i = 0,temp = num[0]; i < n; i++) {
            //这里最后一个点，不用去计算肯定占一个
            if ((num[i]- temp) > length) {
                temp = num[i];
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        code410 demo = new code410();

        demo.solve(7,3,new int[]{1,2,3,4,5,-2,6});
    }
}
