package book.practices.code;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code49
 * @Create : 2019/12/31
 * @Description :
 *
 *
 *  汽车加油问题，最少的加油次数，到达目的地，如果无法到达，输出 :No Solution
 */
public class code49 {


    /**
     * 利用贪心算法，
     *  每次 行驶 最大距离，可以让 加油次数最少
     * @param n
     * @param length
     * @param num
     */
    private void solve(int n, int length, int[] num) {
        int sum  = 0;
        int count = 0;
        int i ;
        for ( i =0; i<= n ; i++){
            sum += num[i];

            if (sum >= n) {
                sum = num[i];
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        code49 demo  = new code49();
        demo.solve(7,7,new int[]{1,2,3,4,5,1,6,6});
    }
}
