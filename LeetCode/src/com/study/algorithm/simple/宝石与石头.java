package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 宝石与石头 .java
 * @Create : 2019-02-23-21:22
 * @Description :  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class 宝石与石头  {


    public int numJewelsInStones(String J, String S) {

        char[] J1 = J.toCharArray();
        char[] S1 = S.toCharArray();
        int [] length = new int[J.length()];
        for (int i=0 ; i< S1.length; i++){

            for (int k=0; k < J1.length; k++){

                if (S1[i] == J1[k]){
                    length[0] += 1;
                }
            }
        }
        int sum = 0;
        for (int i : length){
            sum += i;
        }
        return sum;
    }
    public int numJewelsInStones1(String J, String S) {

        char[] j1 = J.toCharArray();

        int length  = 0;
        for (int i=0; i< J.length();i++){
            String[] ary = ("," + S + ",").split(j1[i] + "");
            length += (ary.length-1);
        }
        return length;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";


        宝石与石头 aa = new 宝石与石头();
        System.out.println(aa.numJewelsInStones1(J,S));

    }
}
