package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 环形链表
 * @Create : 2020/3/6
 * @Description :
 */
public class 环形链表 {

    /**
     *  题目的意思 : 给定的链表，然后根据pos 参数，判断环是否存在，并存在pos
     *  所指引 的位置
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head,int pos) {

        //判断是否是一个数的链表
        if (head.next == null){
            return false;
        }
        //如何判断是否一个环，
        ListNode tmp = head;
        for (int i = 0 ; i<= pos; i++) {
            tmp = tmp.next;
        }
        head = tmp;
        while (head.next != null){
            //tmp 指针向前一步
            head = head.next;
            if (head.next == tmp){

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        环形链表 a = new 环形链表();

        ListNode aa = new ListNode(3);
//        aa.next = new ListNode(2);
//        aa.next.next = new ListNode(0);
//        aa.next.next.next = new ListNode(4);
//        aa.next.next.next = aa.next;
        System.out.println(a.hasCycle(aa, -1));
    }
}

