package com.category.linked;

import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question82
 * @createTime: 2022年06月06日 20:03:02
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

        // 节点数为一，或者零，返回head
        if (head.next == null) {
            return head;
        }

        ListNode result = new ListNode();
        ListNode resultN = result;
        while (true) {
            if (head.next != null) {
                if (head.val == head.next.val) {
                    head = head.next;
                } else {
                    resultN.val = head.val;
                    resultN.next = new ListNode();
                    resultN = resultN.next;
                    head = head.next;
                }
            } else {
                break;
            }
        }
        return result.next;
    }
}
