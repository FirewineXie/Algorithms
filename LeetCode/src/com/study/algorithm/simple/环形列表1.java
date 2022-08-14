package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 环形列表1
 * @Create : 2020/3/23
 * @Description :
 */
public class 环形列表1 {

    public boolean hasCycle(ListNode head) {


        return true;
    }

    public static void main(String[] args) {
        环形列表1 a = new 环形列表1();

        ListNode aa = new ListNode(3);
        aa.next = new ListNode(2);
        aa.next.next = new ListNode(0);
        aa.next.next.next = new ListNode(4);
        aa.next.next.next = aa.next;
        System.out.println(a.hasCycle(aa));
    }
}
