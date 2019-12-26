package book.practices.code;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: code25
 * @Create : 2019/12/26
 * @Description :
 */
public class code25 {

    int count= 0;

    public static void main(String[] args) {


        code25 demo = new code25();
        char list[] = {'a','a','c','c'};

        demo.perm(list,0,3);
        System.out.println(demo.count);
    }

    /**
     * 因为java  的数组是引用 ，所有 这里的交换 ，是无效化的，需要重新改
     * @param a
     * @param b
     */
    void swap(char[] list , int  a , int  b){
        char temp = list[a] ;
        list[a] = list[b];
        list[b]  =temp;
    }
    Boolean finish(char list[],int k,int i) {
        //第i个元素是否在前面元素[k...i-1]中出现过
        //从而判断是否前面已经出现的组合，判断重复
        if(i>k)
        {
            for(int j=k;j<i;j++){
                if(list[j]==list[i]){
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * 有重复元素的排列问题，不能够使用set 来自动区别重复
     * @param list
     * @param k  变化
     * @param m 变化  这两个变量变化 ，通过位置交换
     */
    private void perm(char[] list, int k, int m){
        if(k==m) {
            //当只剩下一个元素时则输出
            count++;
            for(int i=0;i<=m;i++){
                System.out.printf("%c",list[i]);
            }
            System.out.println();
        }
        for(int i=k;i<=m;i++)
            //还有多个元素待排列，递归产生排列
        {
            if(finish(list,k,i))
            {
                swap(list,k,i);
                perm(list,k+1,m);
                swap(list,k,i);
            }
        }
    }



}
