package com.item.bm.linked;

import java.util.ArrayList;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm5
 * @createTime 2022年09月12日 08:41:44
 * @Description TODO
 */
public class Bm5 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {

        return mergeList(lists, 0, lists.size() - 1);
    }

    private ListNode mergeList(ArrayList<ListNode> lists, int l, int r) {

        if (l == r) {

            return lists.get(l);
        }
        if (l > r) {
            return null;
        }

        int mid = l + ((r - l) >> 1);

        return merge(mergeList(lists, l, mid), mergeList(lists, mid + 1, r));
    }

    private ListNode merge(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = (l1 == null ? l2 : l1);
        return dummy.next;
    }
}
