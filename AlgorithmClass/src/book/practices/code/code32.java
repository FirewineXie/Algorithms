package book.practices.code;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: code32
 * @Create : 2019/12/28
 * @Description :
 */
public class code32 {

    /**
     * 编辑距离问题
     * fxpimu
     * xwrs
     *
     *
     *
     * 输出5
     *
     *
     * 状态定义:Fi,j表示第一个字符串的前i个字母和第二个字符串的前j个字母需要编辑的次数，
     * 求Fn,m，n和m分别是两个字符串的长度。
     *
     * 状态转移方程：
     * 当Fi,j-1=Fi-1,j时，Fi,j=Fi,j-1；
     * 当Fi,j-1！=Fi-1,j时，Fi,j=min{Fi-1,j-1,Fi,j-1,Fi-1,j}+1.
     */

    private  void solve (String n,String m){
        int  aLen = n.length();
        int  bLen = m.length();

        int[][] dp  = new int[aLen+1][bLen+1];
        for (int i= 0; i< aLen+1;i++){
            dp[i][0]=i;
        }
        for (int i = 0;i < bLen+1;i++){
            dp[0][i] = i;
        }
        //开始状态运算
        for (int i = 1; i < aLen+1; i++) {
            for (int j = 1; j<bLen+1;j++){
                if (n.charAt(i - 1) == m.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                    System.out.println(i+"-"+j+"->" + dp[i][j]);
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                   System.out.println(i+"-"+j+" ->" + dp[i][j]);
                }
            }
        }
        System.out.println(dp[aLen][bLen]);
    }


    public static void main(String[] args) {

        code32 demo = new code32();
        String n = "fxpimu";
        String m = "xwrs";
        demo.solve(n,m);






    }
}
