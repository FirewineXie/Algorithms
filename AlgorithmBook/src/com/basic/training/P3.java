package com.basic.training;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: P3.java
 * @Create : 2019-02-14-15:14
 * @Description :  <br/>
 */
public class P3 {


    public static void main(String[] args) throws IOException {

        int a,b,c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a == b) && (a ==c) && (b == c)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
