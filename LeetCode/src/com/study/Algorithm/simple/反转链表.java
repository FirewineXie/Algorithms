package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 反转链表
 * @Create : 2020/3/2
 * @Description :
 */
public class 反转链表 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    /**
     *  1. 迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode result = null;

        while (head != null){

            ListNode  tmp = head.next;
            head.next = result;
            result = head;
            head = tmp;


        }

        return result;
    }

    /**
     *  递归
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode result = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode a  = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);


        反转链表 q = new 反转链表();
        ListNode result = q.reverseList1(a);

        while (result != null){

            System.out.println(result.val);
            result = result.next;
        }

    }
}

