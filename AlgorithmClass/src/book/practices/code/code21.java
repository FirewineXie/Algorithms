package book.practices.code;

import java.util.Arrays;




/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: code21
 * @Create : 2019/12/26
 * @Description :
 */
public class code21 {

    /**
     * 众数问题，在集合中，得出出现次数最长的数字
     */
    private void setZS(int[] a){


        int maxCount = 1;
        Arrays.sort(a);

        int length = a.length;
        int i=0;
        int  index = 0;
        while (i < length-1){
            int count = 1;
            int j;
            for (j = i; j < length - 1; ++j) {
                if (a[j] == a[j+1]){
                    count++;
                }else{
                    break;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                index = j;
            }
            ++j;
            i = j;
        }
        System.out.println(maxCount +" "   + a[index]);
    }

    public static void main(String[] args) {

        int[] a = {1,2,2,2,3,5};


        code21 demo  = new code21();

        demo.setZS(a);


    }
}
