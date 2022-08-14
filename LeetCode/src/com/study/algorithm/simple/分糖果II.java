package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 分糖果II
 * @Create : 2020/3/5
 * @Description :
 */
public class 分糖果II {

    public int[] distributeCandies(int candies, int num_people) {

        //结果
        int[] result= new int[num_people];
        // 分配给这同学的糖果数
        int count = 1;
        //人数
        int i = 0;
        //糖果总数
        int sum = 0;
        while (sum < candies){

            if (count > (candies-sum)){
                result[i] += candies-sum;
            }else {
                result[i] += count;
            }


            sum += count;
            count++;
            i++;
            if (i == num_people ){
                i = 0;
            }


        }

        return result;
    }
    public int[] distributeCandies1(int candies, int num_people) {

        int n = num_people;
        // how many people received complete gifts
        int p = (int)(Math.sqrt(2 * candies + 0.25) - 0.5);
        int remaining = (int)(candies - (p + 1) * p * 0.5);
        int rows = p / n, cols = p % n;

        int[] d = new int[n];
        for(int i = 0; i < n; ++i) {
            // complete rows
            d[i] = (i + 1) * rows + (int)(rows * (rows - 1) * 0.5) * n;
            // cols in the last row
            if (i < cols) {
                d[i] += i + 1 + rows * n;
            }
        }
        // remaining candies
        d[cols] += remaining;
        return d;
    }
    public int[] distributeCandies3(int candies, int num_people) {
        double answer = -0.5 + Math.sqrt(0.25 + 2 * candies); //二次方程求解
        int n = (int)Math.ceil(answer);
        int succn = (int)Math.floor(answer);
        int [] ret = new int[num_people];
        for(int i = 0;i < num_people;i++){
            double c = Math.floor(n / num_people);
            if(n % num_people - i > 0) {
                c += 1;
            }
            ret[i] =(int) (c * (i + 1) + (c * c - c) * num_people / 2); //等差求和公式

            if(n > succn && succn % num_people - i == 0){ //如果最后一次糖数不满
                int highanswer = (n * n + n) / 2; //如果不差数所拥有的值
                ret[i] -= highanswer - candies;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        分糖果II  a = new 分糖果II();

        int[] aa = a.distributeCandies(7, 4);

        for (int b : aa){
            System.out.printf("%d ",b);
        }

    }
}
