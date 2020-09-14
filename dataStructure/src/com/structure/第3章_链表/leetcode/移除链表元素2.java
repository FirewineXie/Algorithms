package com.structure.第3章_链表.leetcode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 移除链表元素
 * @Create : 2020/3/4
 * @Description :
 */
public class 移除链表元素2 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);

        dummyHead.next  =head;
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        移除链表元素 a = new 移除链表元素();

        ListNode aa = new ListNode(1);
        aa.next = new ListNode(1);
//        aa.next.next = new ListNode(6);
//        aa.next.next.next = new ListNode(3);
//        aa.next.next.next.next = new ListNode(4);
//        aa.next.next.next.next.next = new ListNode(5);
//        aa.next.next.next.next.next.next = new ListNode(6);

        ListNode b = a.removeElements(aa, 1);
        while (b != null) {
            System.out.println(b.val);
            b = b.next;
        }
    }
}

