package com.category.linked;

import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question82
 * @createTime 2022年06月06日 20:03:02
 * @Description TODO
 */
public class Question82 {

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


    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;


        // 2. 内部出现问题
        if (head.val == next.val) {
            // 1. 头出现问题，
            while (next != null && head.val == next.val) {
                next = next.next;
            }
            //2
            head = deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(next);
        }
        return head;
    }
}
