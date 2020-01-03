package book.practices.code;

import java.util.Arrays;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code46
 * @Create : 2019/12/31
 * @Description :
 *
 *
 * 最优服务次序问题
 */
public class code46 {

    private double avg(int[] a, int n) {
        double sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i]*(n-i);
        }


        return sum/n;
    }
    private double solve(int []a  , int n) {

        Arrays.sort(a);

        return avg(a, n);
    }

    public static void main(String[] args) {

        int [] num = new int[]{56,12,1,99,1000,234,33,55,99,812};


        code46 demo = new code46();
        System.out.println(demo.solve(num, 10));
    }
}
