package book.practices.code;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: code211
 * @Create : 2019/12/27
 * @Description :
 */
public class code211 {

    int count = 0;
    /**
     *  采用递归的形式
     *
     * @param n
     * @return
     */
    private void deco(int n){

        if (n == 1) {
            // 当商为1的时候，即为已经算出一次分解累计 + 1
            count++;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0){
                deco(n / i);
            }
        }
    }


    public static void main(String[] args) {

        code211 demo = new code211();

        demo.deco(12);
        System.out.println(demo.count);
    }
}
