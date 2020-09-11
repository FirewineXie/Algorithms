package book.practices.code;

/**
 * @author : Firewine
 * @version : 1.0
 * @Program Name: code415
 * @Create : 2019/12/31
 * @Description :
 * 最优分解问题
 */
public class code415 {


    private void solve(int n) {

        int[] p = new int[n / 2];

        int i, j, num = 0;
        int s = 1;

        p[0] = 2;
        int diff = n - 2;
        for (i = 0; i < n / 2; i++) {
            p[i + 1] = p[i] + 1;
            diff -= p[i + 1];
            if (diff <= p[i + 1]) {
                break;
            }
        }

        num = i + 2;
        //n=15,i=2时diff<p[i+1],退出循环，i仍然为2，但实际呢，
        //有p[0],p[1],p[2],p[3]四个元素，所以再加2 ，得到数组的个数

        while (diff != 0) {
            //此时diff为1，还需要把它加到前面的各个数上
            //原则：后项优先，所以应该给p[3]加上
            j = num;
            p[j - 1]++;
            diff--;
            j--;
            if (j == 0) {
                //因为循环赋值
                j = num;
            }
        }


        for (i = 0; i < num; i++) {
            s *= p[i];

        }


        System.out.println(s);
    }

    public static void main(String[] args) {

        code415 demo = new code415();
        demo.solve(10);
    }
}
