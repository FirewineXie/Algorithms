package com.category.linked;

import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question21
 * @createTime: 2022年06月06日 19:28:25
 * @Description TODO
 */
public class Question21 {


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 1. 已知条件 两个链表是有序的，返回一个合并的链表

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode temp = head;

        while (list1 != null && list2 != null) {
            temp.next = new ListNode();

            if (list1.val >= list2.val) {
                temp.next.val = list2.val;
                list2 = list2.next;

            } else {
                temp.next.val = list1.val;
                list1 = list1.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }


        return head.next;
    }


}
