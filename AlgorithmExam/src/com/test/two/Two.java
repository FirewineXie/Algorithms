package com.test.two;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: TestTwo
 * @Create : 2020/3/3
 * @Description :
 *
 * a,s
 * a,d
 * s,a
 * s,d
 * d,a
 * d,s
 */
public class Two {


    public static void main(String[] args) {
        
        
        Two a = new Two();

        Scanner scanner = new Scanner(System.in);

        a.puq(  scanner.next());
    }

    private void puq(String str) {

        for (int i = 0 ; i < str.length() ;i++){
            int a= 0;
            while (a < (str.length())) {
                if (str.charAt(i) != str.charAt(a)) {
                    System.out.println(str.charAt(i) + "," + str.charAt(a));
                    a++;
                }else {
                    a++;
                }

            }
        }

    }
}
