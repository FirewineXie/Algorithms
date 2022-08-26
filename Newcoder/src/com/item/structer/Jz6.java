package com.item.structer;

import java.util.ArrayList;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz6
 * @createTime 2022年08月24日 14:21:35
 * @Description TODO
 */
public class Jz6 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> data = new ArrayList<>();
        ListNode nextNode = listNode;
        while (nextNode != null) {
            data.add(nextNode.val);
            nextNode = nextNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = data.size() - 1; i >=0; i--) {
            result.add(data.get(i));
        }

        return result;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
