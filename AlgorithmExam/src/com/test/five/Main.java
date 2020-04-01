package com.test.five;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Main
 * @Create : 2020/3/11
 * @Description :
 */
public class Main {

    public static void main(String[] args) {


        Main a = new Main();
        Scanner in = new Scanner(System.in);
        String mid  = in.next();
        String back = in.next();
//        String mid = "DBHEAGCF";
//        String back = "DHEBGFCA";
//        System.out.println(a.sOrder(mid, back));
    }

    public String sOrder(String mid, String back) {

        // 由 后序知道根节点在 最后面
        char root  = back.charAt(back.length()-1);
        // 由中序知道，左右子树的 节点

        // 前序 是 根节点 -》 左节点 -》 有节点
        // 中序 是 左节点
        return "";

    }



}
