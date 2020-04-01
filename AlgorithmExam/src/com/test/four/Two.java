package com.test.four;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Two
 * @Create : 2020/3/5
 * @Description :
 *   32 位整数 反转
 */
public class Two {


    public int rever(int n){

        if ( n < 0 ){
            char[] chars = String.valueOf(-n).toCharArray();

            for (int i = 0 ; i < chars.length/2 ; i++){
                char tmp = chars[i];
                chars[i] = chars[chars.length -i-1];
                chars[chars.length-i-1] = tmp;
            }

            StringBuilder str = new StringBuilder();
            str.append('-');
            for ( int i = 0 ; i< chars.length ;i++){
                str.append(chars[i]);
            }
            if ( Double.parseDouble(str.toString()) > (-(Math.pow(2,31)))){
                return Integer.parseInt(str.toString());
            }else {
                return 0;
            }

        }else if (n == 0){
            return  0;
        }else {
            char[] chars = String.valueOf(n).toCharArray();

            for (int i = 0 ; i < chars.length/2 ; i++){
                char tmp = chars[i];
                chars[i] = chars[chars.length -i-1];
                chars[chars.length-i-1] = tmp;
            }

            StringBuilder str = new StringBuilder();

            for ( int i = 0 ; i< chars.length ;i++){
                str.append(chars[i]);
            }
            if ( Double.parseDouble(str.toString())> (Math.pow(2,31) -1)){

                return 0;
            }else {
                return Integer.parseInt(str.toString());
            }

        }
    }

    public static void main(String[] args) {
        Two a = new Two();
        System.out.println(a.rever(-123));
    }
}
