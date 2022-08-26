package com.item.structer;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz25
 * @createTime 2022年08月25日 08:43:38
 * @Description TODO
 */
public class Jz25 {

    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode result = new ListNode(0);
        ListNode next = result;
        while (list1 != null && list2 != null) {

            if (list1.val >= list2.val) {
                next.next = list2;
                list2 = list2.next;
            } else {
                next.next = list1;
                list1 = list1.next;
            }
            next = next.next;
        }

        if (list1 != null) {
            next.next = list1;
        }
        if (list2 != null) {
            next.next = list2;
        }

        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
